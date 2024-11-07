// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		//our inputes from command line:
		int CurrentValue = Integer.parseInt(args[0]);
		double Rate = Double.parseDouble(args[1]);
		int Years = Integer.parseInt(args[2]);
		double DivRate = Rate/100;
		double FutureValue = CurrentValue * (Math.pow(1+DivRate, Years));
		System.out.print("After "); 
		System.out.print(Years); 
		System.out.print(" years, a $"); 
		System.out.print(CurrentValue); 
		System.out.print(" saved at "); 
		System.out.print(Rate); 
		System.out.print("% will yield $"); 
		System.out.print((int) FutureValue);
	}
}