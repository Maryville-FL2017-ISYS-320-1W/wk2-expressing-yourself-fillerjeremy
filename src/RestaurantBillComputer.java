
public class RestaurantBillComputer {
	public static void main (String[] args) {
		
		double subtotal;
		double taxrate;
		double tiprate15 = .15;
		double tiprate18 = .18;
		double tiprate20 = .20;
		
		subtotal = 30;
		taxrate = .8;
		
		double billtotal15 = (subtotal + (subtotal * taxrate) + (subtotal * tiprate15));
		double billtotal18 = (subtotal + (subtotal * taxrate) + (subtotal * tiprate18));
		double billtotal20 = (subtotal + (subtotal * taxrate) + (subtotal * tiprate20));
		
		System.out.print("With a 15% tip, your total would be $");
		System.out.println(billtotal15);
		System.out.print("With a 18% tip, your total would be $");
		System.out.println(billtotal18);
		System.out.print("With a 20% tip, your total would be $");
		System.out.println(billtotal20);
		
	}
}
