public class JFT4Ex2 {

	public static void main (String [] args) {
	
		double basicItemPrice = 14.50;
		double vatRate = 0.23;
		double vatPayable = basicItemPrice*vatRate;
		double totalIncVAT = basicItemPrice+vatPayable;
	
		System.out.println("Purchase Amount: €"+basicItemPrice);
		System.out.println("VAT Payable: €"+vatPayable);
		System.out.println("Total Price: €"+totalIncVAT);
	
	}
}

/*
Exercise 2 – VAT Payable

Task:
Write a Java program to calculate the VAT payable and total purchase price for a bottle of
whiskey.
The price before VAT is €14.50. The VAT rate is 23%.
Calculate and display the VAT and total price payable.
Use variables as part of your solution. Save the program as JFT4Ex2.java
*/
