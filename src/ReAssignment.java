/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*
 	Your predicted values for variables a, b, and c
	a => 6 - correct
	b =>9 - correct
	c => 14 - it came up as 16. I feel like it should be 15. It is using the updated version of variable A but not the updated version of variable B. WHY??
 
 	After testing the statements in the main method, indicate above if your predictions were correct.
*/

public class ReAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		int c = b;
		a = a +1;
		b = b - 1;
		c = c + a;
		b = c%a;
	System.out.println(b);
	}

}
