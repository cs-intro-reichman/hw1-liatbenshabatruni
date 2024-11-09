
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int RangeNumber = Integer.parseInt(args[0]);
		// lottery the three numbers between 0 to recived arg
		int a =  (int) (Math.random() * RangeNumber);
		int b =  (int) (Math.random() * RangeNumber);
		int c =  (int) (Math.random() * RangeNumber);
		// cheking which number is max, min and which is neither nor
		int MinNum = Math.min(Math.min(a, b), c);
		int MaxNum = Math.max(Math.max(a, b), c);
		int MidNum = Math.max(Math.min(a,b),c);
		//mid is the min berteen a number and the max and the max between the min and a number
		System.out.print(MinNum);
		System.out.print(" ");
		System.out.print(MidNum);
		System.out.print(" ");
		System.out.print(MaxNum);
		

		
	}
}
