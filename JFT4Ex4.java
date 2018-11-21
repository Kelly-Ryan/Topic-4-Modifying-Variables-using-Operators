public class  JFT4Ex4 {
	
	public static void main (String [] args) {
		
		int totalMinutesWorked = 199;
		int hoursWorked = totalMinutesWorked/60;
		int remainderMinutes = totalMinutesWorked%60;
		
		System.out.println("Hours: "+hoursWorked+" Minutes: "+remainderMinutes);
		
	}
	
}

/*
Exercise 4 – TimeClock

Task:
Write a program that declares a variable to store the number of minutes worked on a job
and assign it a value.
Now, convert the number of minutes into hours and minutes.
For example, 199 minutes becomes 3 hours and 19 minutes.
Make use of variables in your solution.
Save the program as JFT4Ex4.java
*/