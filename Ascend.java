
public class Ascend {
	public static void main(String[] args) {
		//reciving the range from the command line:
		int RangeNumber = Integer.parseInt(args[0]);
		// lottery the three numbers between 0 and a recived argument:
		// multiply the outcome from random by RangeNumber in order to extend the given range of Math.random
		int a =  (int) (Math.random() * RangeNumber);
		int b =  (int) (Math.random() * RangeNumber);
		int c =  (int) (Math.random() * RangeNumber);
		// cheking which number is max or min with orerating Math.min/max function twice at a time 
		//mid is the min berteen a number and the max and the max between the min and a number
		int MinNum = Math.min(Math.min(a, b), c);
		int MaxNum = Math.max(Math.max(a, b), c);
		int MidNum = Math.max(Math.min(a,b),c);
		//printing out the numbers in ascending order
		System.out.print(MinNum);
		System.out.print(" ");
		System.out.print(MidNum);
		System.out.print(" ");
		System.out.print(MaxNum);
		

		
	}
}
