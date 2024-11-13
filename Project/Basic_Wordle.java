import java.util.Scanner;
public class Basic_Wordle 
{
	//States what's the solution and opens the scanner
	private static final String solution = "clean"; 
	private static final Scanner scanner = new Scanner(System.in);
	
	
	//Welcomes the player into the game, starts the game and closes he scanner
	public static void main(String[] args) 
{
	System.out.println("Welcome to Wordle! Try to guess the 5-letter word.");
    playGame();
	scanner.close();
	}
	
	//Commands that sets up the first part of the game
	private static void playGame() 
	{
        //Let's the player make a guess
		System.out.print("Please make a guess: ");
        String guess = scanner.nextLine().toLowerCase();

        //If the guess is less more or less than the 5-letter max/min it'll say it's invalid
        if (guess.length() != 5 || repeatingLetters(guess, 0)) 
        {
            System.out.println("Invalid guess. Please enter a 5-letter word with no repeating letters.");
            playGame(); 
            return;
        } 
        
        
        //Plays the feedback code
        String feedback = getFeedback(guess, 0);
        System.out.println(feedback);
        
        
        //If the guess is correct it congratulate the player otherwise it'll play the game again
        if (guess.equals(solution)) 
        {
        System.out.println("Good job! The word was " + solution + "!");
        } 
        else 
        {
        playGame(); 
        }  
	}
	
	
	//Checks for repeating letters in a word
	private static boolean repeatingLetters(String word, int index) 
	{
		if (index >= word.length())
		{
		return false;
		}
        if (word.indexOf(word.charAt(index)) != index) 
        {
        return true;
        }
        return repeatingLetters(word, index + 1);
    }
	
	
	//Generates feedback
	private static String getFeedback(String guess, int index) 
	{
        if (index >= solution.length())
        {
        	return "";
        }
        
        
        char character = guess.charAt(index);
        String feedbackChar;
        
        
        //If the letter is correct and at the correct position it'll indicate it
        if (character == solution.charAt(index)) 
        {
            feedbackChar = String.valueOf(character); 
        } 
        //If the letter is correct, but not in the correct position it'll put a question mark
        else if (solution.contains(String.valueOf(character))) 
        {
            feedbackChar = "?"; 
        }
        //If neither letter or position is correct it'll put an X
        else 
        {
            feedbackChar = "X"; 
        }
        return feedbackChar + getFeedback(guess, index + 1);
	}
}
