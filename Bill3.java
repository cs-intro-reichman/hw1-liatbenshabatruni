// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// reciving the inputes - three diners and thier bill
	    String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
		String sum = args[3];
		int FinalSum = Integer.parseInt(sum);
	    // creating 2 vars to calculate how much for each diner:
		// casting int to FinalSum double as asked:
		double a = FinalSum; 
		double b;
		//making sure the FinalSum will round up
		b = Math.ceil(a/3);
		//printing the final price for each diner
		System.out.print("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay ");
		System.out.print(b);
		System.out.print(" Shekels each.");
	}
}
