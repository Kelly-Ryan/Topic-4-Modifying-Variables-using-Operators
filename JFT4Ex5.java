public class  JFT4Ex5 {
	
	public static void main (String [] args) {
		
		double initialInvestment = 1000;
		double interestRate = 0.05;
		double interestEarned = initialInvestment*interestRate;
		double totalInvestmentValue = initialInvestment+interestEarned;
		
		System.out.println("The principal is "+initialInvestment+" Euro.");
		System.out.println("The rate of interest is "+interestRate+"%.");
		System.out.println("The interest earned is "+interestEarned+" Euro.");
		System.out.println("The value of the investment is: "+totalInvestmentValue+" Euro.");
		
	}

}
/*
Exercise 5 – My Investment

Task:
Write a program to calculate the total value of an investment.
Assume the amount of the initial investment is €1000. Assume that the investment will
earn interest at a rate of 5%. How much interest will be earned? What is the total value of
the investment including interest? Make use of variables in your solution.
Output to the console:
 Principal Sum Invested
 Interest Rate
 Total Value of Investment
Save the program as JFT4Ex5.java
*/