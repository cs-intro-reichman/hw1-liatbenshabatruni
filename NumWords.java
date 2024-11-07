// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // reciving the input from the command line
		int NumberToWords = Integer.parseInt(args[0]);
		double OnesInNumber = (double)NumberToWords%10;
		NumberToWords = NumberToWords/10;
		double TensInNumber = ((double)NumberToWords)%10;
		NumberToWords = NumberToWords/10;
		double HundredsInNumber = ((double)NumberToWords)%10;
		System.out.print((int)HundredsInNumber);
		System.out.print(" hundreds, ");
		System.out.print((int)TensInNumber);
		System.out.print(" tens, and ");
		System.out.print((int)OnesInNumber);
		System.out.print(" ones.");
	}
}
