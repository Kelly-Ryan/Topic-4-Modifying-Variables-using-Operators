public class JFT4Ex7 {
	
	public static void main (String [] args) {
		
		//room dimensions are in feet
		double roomLengthFeet = 25.00;
		double roomWidthFeet = 42.00;
		double totalSquareFeet = roomLengthFeet*roomWidthFeet;
		
		double totalSquareYards = totalSquareFeet/9;			//nine square feet in one square yard
		double costPerSquareYard = 37.99;
		double totalCost = totalSquareYards*costPerSquareYard;
		
		System.out.println("***************************************");
		System.out.println("       Carpeting Cost Analysis:        ");
		System.out.println("***************************************");
		System.out.println("Square Feet: "+totalSquareFeet);
		System.out.println("Square Yards: " +totalSquareYards);
		System.out.println("Cost of Carpeting in Square Yards: "+totalCost+" Euro");
		
	}

}
/*
Exercise 7 – Carpeting

Task:
The area of a room is calculated by multiplying length by width.
Compute and display the cost of carpeting a room in square yards.
Create variables to store the length (25.00) and width (42.00) of a room in square feet.
The program needs to calculate the total cost of carpeting per square yard in Euro and cent.
The cost of carpeting per square yard is €37.99.
Note: There are nine square feet in one square yard.
Compute and display the cost of carpeting the room in square yards.
Save the program as JFT4Ex7
*/