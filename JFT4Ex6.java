public class  JFT4Ex6 {
	
	public static void main (String [] args) {
		
		int totalMoney = 57;
		
		int noOf20s = totalMoney/20;	//2 20s in 57
		int remainder = totalMoney%20;	//remainder of 17
		
		int noOf10s = remainder/10;		//1 ten in 17
		remainder = remainder%10;		//remainder of 7
		
		int noOf5s = remainder/5;		//1 5 in 7
		remainder = remainder%5;		//remainder of 2
		
		int noOf1s = remainder;			//2 1s in 2
		
		System.out.println("**********Coin Machine**********");
		System.out.println("Sum of money is "+totalMoney+" Euro.");
		System.out.println("No. of 20s: "+noOf20s);
		System.out.println("No. of 10s: "+noOf10s);
		System.out.println("No. of 5s: "+noOf5s);
		System.out.println("No. of 1s: "+noOf1s);
		System.out.println("********************************");
		
	}

}
/*
Exercise 6 – CoinMachine

Task:
Given a sum of money (ex: €57), write a program to display the count of the following
currency denominations:
 €20 notes
 €10 notes
 €5 notes
 €1 coins
Use variables as part of your solution. Save the program as JFT4Ex6.java
*/