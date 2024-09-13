//* This project will do the following task listed
public class Methods_Intro_Practice {

	public static void main(String[] args) {
	
//* Generates my name, hair style, and best friend
	System.out.println("Task 1:");
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		System.out.println();
		
//* Generates the radius, diameter, circumference, and area
	System.out.println("Task 2:");
		printCircleStats(9);
		System.out.println();
		
//* Generates the sum, difference, product, quotient, and remainder
	System.out.println("Task 3:");
		printMathStuffs(7, 9);
	}

//* Creates void methods for all the following topics
	public static void stateName()
	{
		System.out.println("Name: Syril-Jem Calicdan");
	}
	public static void stateEyeColor()
	{
		System.out.println("Eye Color: Brown");
	}
	public static void stateHairStyle()
	{
		System.out.println("Hair Style: Bowl Cut");
	}
	public static void stateBestFriend()
	{
		System.out.println("Best Friend: debatable");	
	}
	public static void stateFavoriteFood()
	{
		System.out.println("Favorite Food: lithium batteries");	
	}
	
//* Creates void methods for the calculations the diameter, circumference, and area of a circle
	public static void printCircleStats(int radius)  
	{
		int diameter=radius*2;
		double pi=3.14159;
		
		System.out.println("Radius= " + radius);
		System.out.println("Diameter= " + diameter);
		System.out.println("Circumference= " + (double)radius*pi*2);
		System.out.println("Area= " + pi*radius*radius);
	}
	
//* 
	public static void printMathStuffs(int number1, int number2)
	{
		int sum=number1+number2;
		int difference=number1-number2;
		int product=number1*number2;
		double quotient=(double) number1/number2;
			int remainder=number1%number2;
		
		System.out.println("Sum= " + sum);
		System.out.println("Difference= " + difference);
		System.out.println("Product= " + product);
		System.out.println("Quotient= " + quotient);
		System.out.println("Reminder= " + remainder);
	}
	
}
