package interest_calculator;
	import java.util.Scanner;
	public class InterestCalculator {
		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			float principle= s.nextFloat();
			int rate=s.nextInt();
			int time=s.nextInt();
			float interest=principle*rate*time;
		
			
			System.out.println("interestrate is:"+(interest));
			
		}


	}


