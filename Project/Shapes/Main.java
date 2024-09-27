/**
 * This is where we print all the classes for the shapes and their dimensions
 */
public class Main {
	
	public static void main(String[] args) {
	/**
	 * Sets radius for three circles
	 */
		Circle circOne=new Circle(3.0);
		Circle circTwo=new Circle(20.0);
		Circle circThree=new Circle(-4.0);
	
		
	/**
	 * Prints circle one's dimensions 
	 */
		System.out.println(Circle.getShapeName() + "One's Radius: " + circOne.getRadius());
		System.out.println(Circle.getShapeName() + "One's Diameter: " + circOne.getDiameter());
		System.out.println(Circle.getShapeName() +  "One's Circumference: " + circOne.getCircumference());
		System.out.println(Circle.getShapeName() +  "One's Area: " + circOne.getArea() + "\n");
	
		
	/**
	 * Prints circle two's dimensions	
	 */
		System.out.println(Circle.getShapeName() +  "Two's Radius: " + circTwo.getRadius());
		System.out.println(Circle.getShapeName() + "Two's Diameter: " + circTwo.getDiameter());
		System.out.println(Circle.getShapeName() +  "Two's Circumference: " + circTwo.getCircumference());
		System.out.println(Circle.getShapeName() +  "Two's Area: " + circTwo.getArea() + "\n");
	
			
	/**
	 * Prints circle three's dimensions
	 */
		System.out.println("Circle Three's Radius: " + circThree.getRadius());
		System.out.println("Circle Three's Diameter: " + circThree.getDiameter());
		System.out.println("Circle Three's Circumference: " + circThree.getCircumference());
		System.out.println("Circle Three's Area: " + circThree.getArea() + "\n");
		
	
	/**
	 * Sets radius for three spheres
	 */
		Sphere spheOne=new Sphere(7.0);
		Sphere spheTwo=new Sphere(29.0);
		Sphere spheThree=new Sphere(94.0);
	
		
	/**
	 * Prints sphere one's dimensions
	 */
		System.out.println(Sphere.getShapeName() + "One's Radius: " + spheOne.getRadius());
		System.out.println(Sphere.getShapeName() + "One's Diameter: " + spheOne.getDiameter());
		System.out.println(Sphere.getShapeName() + "One's SurfaceArea: " + spheOne.getSurfaceArea());
		System.out.println(Sphere.getShapeName() + "One's Volume: " + spheOne.getVolume() + "\n");
	
		
	/**
	 * Prints sphere two's dimensions		
	 */
		System.out.println(Sphere.getShapeName() + "Two's Radius: " + spheTwo.getRadius());
		System.out.println(Sphere.getShapeName() + "Two's Diameter: " + spheTwo.getDiameter());
		System.out.println(Sphere.getShapeName() + "Two's SurfaceArea: " + spheTwo.getSurfaceArea());
		System.out.println(Sphere.getShapeName() + "Two's Volume: " + spheTwo.getVolume() + "\n");
	
		
	/**
	 * Prints sphere three's dimensions	
	 */
		System.out.println(Sphere.getShapeName() + "Three's Radius: " + spheThree.getRadius());
		System.out.println(Sphere.getShapeName() + "Three's Diameter: " + spheThree.getDiameter());
		System.out.println(Sphere.getShapeName() + "Three's SurfaceArea: " + spheThree.getSurfaceArea());
		System.out.println(Sphere.getShapeName() + "Three's Volume: " + spheThree.getVolume() + "\n");
	
	
		
	/**
	 * Sets edges for three icosahedrons
	 */
		Icosahedron icoOne=new Icosahedron(2.0);
		Icosahedron icoTwo=new Icosahedron(45.0);
		Icosahedron icoThree=new Icosahedron(81.0);
	
		
	/**
	 * Prints icosahedron one's dimensions 
	 */
		System.out.println(Icosahedron.getShapeName() + "One's Radius: " + icoOne.getEdge());
		System.out.println(Icosahedron.getShapeName() + "One's SurfaceArea: " + icoOne.getSurfaceArea());
		System.out.println(Icosahedron.getShapeName() + "One's Volume: " + icoOne.getVolume() + "\n");
	
		
	/**
	 * Prints icosahedron two's dimensions 
	 */
		System.out.println(Icosahedron.getShapeName() + "Two's Radius: " + icoTwo.getEdge());
		System.out.println(Icosahedron.getShapeName() + "Two's SurfaceArea: " + icoTwo.getSurfaceArea());
		System.out.println(Icosahedron.getShapeName() + "Two's Volume: " + icoTwo.getVolume() + "\n");
	
		
	/**
	 * Prints icosahedron two's dimensions 
	 */
		System.out.println(Icosahedron.getShapeName() + "Three's Radius: " + icoThree.getEdge());
		System.out.println(Icosahedron.getShapeName() + "Three's SurfaceArea: " + icoThree.getSurfaceArea());
		System.out.println(Icosahedron.getShapeName() + "Three's Volume: " + icoThree.getVolume() + "\n");
	
		
	/**
	 * Sets base edges and heights for three hexagonal prism
	 */
		HexagonalPrism hexpOne=new HexagonalPrism(5, 2);
		HexagonalPrism hexpTwo=new HexagonalPrism(7, 72);
		HexagonalPrism hexpThree=new HexagonalPrism(54, 27);
		
		
	/**
	 * Prints hexagonal prism one's dimensions 
	 */
		System.out.println(HexagonalPrism.getShapeName() + "One's Base Edge: " + hexpOne.getBaseEdge());
		System.out.println(HexagonalPrism.getShapeName() + "One's Height: " + hexpOne.getHeight());
		System.out.println(HexagonalPrism.getShapeName() + "One's Base Surface Area: " + hexpOne.getSurfaceArea());
		System.out.println(HexagonalPrism.getShapeName() + "One's Base Volume: " + hexpOne.getVolume());
		System.out.println(HexagonalPrism.getShapeName() + "One's Base Lateral Surface Area: " + hexpOne.getLateralSurfaceArea() + "\n");
	
		
	/**
	 * Prints hexagonal prism two's dimensions 
	 */
		System.out.println(HexagonalPrism.getShapeName() + "Two's Base Edge: " + hexpTwo.getBaseEdge());
		System.out.println(HexagonalPrism.getShapeName() + "Two's Height: " + hexpTwo.getHeight());
		System.out.println(HexagonalPrism.getShapeName() + "Two's Base Surface Area: " + hexpTwo.getSurfaceArea());
		System.out.println(HexagonalPrism.getShapeName() + "Two's Base Volume: " + hexpTwo.getVolume());
		System.out.println(HexagonalPrism.getShapeName() + "Two's Base Lateral Surface Area: " + hexpTwo.getLateralSurfaceArea() + "\n");		
	
		
	/*
	 * Prints hexagonal prism three's dimensions 
	 */
		System.out.println(HexagonalPrism.getShapeName() + "Three's Base Edge: " + hexpThree.getBaseEdge());
		System.out.println(HexagonalPrism.getShapeName() + "Three's Height: " + hexpThree.getHeight());
		System.out.println(HexagonalPrism.getShapeName() + "Three's Base Surface Area: " + hexpThree.getSurfaceArea());
		System.out.println(HexagonalPrism.getShapeName() + "Three's Base Volume: " + hexpThree.getVolume());
		System.out.println(HexagonalPrism.getShapeName() + "Three's Base Lateral Surface Area: " + hexpThree.getLateralSurfaceArea() + "\n");	
		
	/**
	 * Sets bases and a height for three trapezoids
	 */
		Trapezoid trapOne=new Trapezoid(5, 9, 2);
		Trapezoid trapTwo=new Trapezoid(10, 6, 24);
		Trapezoid trapThree=new Trapezoid(13, 35, 99);
		
		
	/**
	 * Prints trapezoid one's dimensions 
	 */
		System.out.println(Trapezoid.getShapeName() + "One's Base Legnths: " + trapOne.getBases());
		System.out.println(Trapezoid.getShapeName() + "One's Height: " + trapOne.getHeight());
		System.out.println(Trapezoid.getShapeName() + "One's Area: " + trapOne.getArea() + "\n");
		
		
	/**
	 * Prints trapezoid one's dimensions 
	 */
		System.out.println(Trapezoid.getShapeName() + "Two's Base Legnths: " + trapTwo.getBases());
		System.out.println(Trapezoid.getShapeName() + "Two's Height: " + trapTwo.getHeight());
		System.out.println(Trapezoid.getShapeName() + "Two's Area: " + trapTwo.getArea() + "\n");
	
		
	/**
	 * Prints trapezoid one's dimensions 
	 */
		System.out.println(Trapezoid.getShapeName() + "Three's Base Legnths: " + trapThree.getBases());
		System.out.println(Trapezoid.getShapeName() + "Three's Height: " + trapThree.getHeight());
		System.out.println(Trapezoid.getShapeName() + "Three's Area: " + trapThree.getArea() + "\n");
	
		
	/**
	 * Sets sides for three octagons
	 */
		Octagon octOne=new Octagon(9);
		Octagon octTwo=new Octagon(55);
		Octagon octThree=new Octagon(21);
	
		
	/**
	 * Prints trapezoid one's dimensions 
	 */
		System.out.println(Octagon.getShapeName() + "One's Side Legth: " + octOne.getSideLength());
		System.out.println(Octagon.getShapeName() + "One's Perimeter: " + octOne.getPerimeter());
		System.out.println(Octagon.getShapeName() + "One's Area: " + octOne.getArea() + "\n");
	
		
	/**
	 * Prints trapezoid two's dimensions 
	 */
		System.out.println(Octagon.getShapeName() + "Two's Side Legth: " + octTwo.getSideLength());
		System.out.println(Octagon.getShapeName() + "Two's Perimeter: " + octTwo.getPerimeter());
		System.out.println(Octagon.getShapeName() + "Two's Area: " + octTwo.getArea() + "\n");
		
		
	/**
	 * Prints trapezoid two's dimensions 
	 */
		System.out.println(Octagon.getShapeName() + "Three's Side Legth: " + octThree.getSideLength());
		System.out.println(Octagon.getShapeName() + "Three's Perimeter: " + octThree.getPerimeter());
		System.out.println(Octagon.getShapeName() + "Three's Area: " + octThree.getArea() + "\n");
	}
}
