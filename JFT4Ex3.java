public class  JFT4Ex3 {

	public static void main (String [] args) {
		
		String employeeName = "Bryan Hayes";
		String employeePPSNo = "6464514D";
		String employeeDepartment = "IT";
		
		double basicHoursWorked = 50.5;
		double overtimeHoursWorked = 13.5;
		double basicHourlyRate = 29.35;
		double overtimeHourlyRate = basicHourlyRate*1.5;	//time and a half
		
		double basicSalary = basicHoursWorked*basicHourlyRate;
		double overtimeSalary = overtimeHoursWorked*overtimeHourlyRate;
		double grossPay = basicSalary+overtimeSalary;
		double incomeTaxRate = 0.35;
		double incomeTaxPayable = grossPay*incomeTaxRate;
		double netPay = grossPay-incomeTaxPayable;
		
		
		System.out.println("********************Salary Report********************");
		System.out.println("");
		System.out.println("******************Employee Details*******************");
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee PPS No: "+employeePPSNo);
		System.out.println("Employee Department: "+employeeDepartment);
		System.out.println("");
		
		System.out.println("********************Hours Worked*********************");
		System.out.println("No. of basic hours worked: "+basicHoursWorked);
		System.out.println("The hourly rate of basic pay is at "+basicHourlyRate+" Euro.");
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("No. of overtime hours worked: "+overtimeHoursWorked);
		System.out.println("The hourly rate of overtime pay is at time and a half.");
		System.out.println("Overtime Salary: "+overtimeSalary);
		System.out.println("");
		
		System.out.println("********************Take Home Pay*********************");
		System.out.println("Gross Pay: "+grossPay);
		System.out.println("Income Tax Payable at "+incomeTaxRate+" is: "+incomeTaxPayable);
		System.out.println("Net Pay: "+netPay);
	
	}

}
/*
Exercise 3 – Employee Pay

Task:
Write a Java program to calculate an employee’s weekly take home pay. Make use of
variables as part of your solution. Save the program as JFT4Ex3.java.
 Employee Name
 PPS No
 Department
 Hours Worked (basic)
 Hours Worked (overtime)
 Basic hourly rate of pay (29.35)
 Overtime hourly rate of pay @1.5 (time and a half)
 Gross Pay
 Income Tax Payable (assume rate is 35%).
 Net Pay
*/