// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
		String sum = args[3];
		int Finalsum = Integer.parseInt(sum);
	    //now calculate how much for each diner:
		double a = Finalsum;
		double b;
		b = Math.ceil(a/3);
		System.out.print("Dear " + name1 + ", " + name2 + ", and " + name3 + ": pay ");
		System.out.print(b);
		System.out.print(" Shekels each");
	}
}
