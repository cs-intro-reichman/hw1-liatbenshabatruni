// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// here are the inputes - three diners and thier bill
	    String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
		String sum = args[3];
		int Finalsum = Integer.parseInt(sum);
	    //now we will use 2 vars to calculate how much for each diner:
		//casting int to double
		double a = Finalsum; 
		double b;
		//making sure it will round up
		b = Math.ceil(a/3);
		//printing the final price for each diner
		System.out.print("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay ");
		System.out.print(b);
		System.out.print(" Shekels each.");
	}
}
