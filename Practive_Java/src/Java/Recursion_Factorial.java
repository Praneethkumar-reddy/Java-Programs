package Java;
import java.util.Scanner;
public class Recursion_Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		System.out.println(factorial(a));
	}
	public static int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		else {
			return(n*factorial(n-1));
		}
	}
}