package string_function;
	import java.util.Scanner;
	public class StringFunction {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name:");
			String name=sc.nextLine();
			if(name.equalsIgnoreCase("Vaibhav"))
			{
				System.out.println("Name entered is Vaibhav");
			}
			else {
				System.out.println("Name entered is not Vaibhav");
			}
		}
	}


