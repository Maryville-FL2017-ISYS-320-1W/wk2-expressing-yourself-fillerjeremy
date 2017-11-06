/*
  	ISYS 320
  	Name(s):Jeremy Filler
  	Date: 11/5/17
*/

public class ComputePay {
	public static void main(String[] args) {
		double hoursworked;
		double hourlysalary;
		double totalpay;
		
		hoursworked = (4+5+8+4);
		hourlysalary = 8.75;
		totalpay = hoursworked * hourlysalary;
		
		System.out.print( "My total hours worked are: ");
		System.out.println(hoursworked);
		System.out.print("My salary is $");
		System.out.print(hourlysalary);
		System.out.println(" per hour.");
		System.out.print("My total pay is: $");
		System.out.println(totalpay);
	}
}
