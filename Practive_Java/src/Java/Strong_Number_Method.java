package Java;
import java.util.Scanner;
public class Strong_Number_Method {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=s.nextInt();
		System.out.println(strongNumber(num));
	}
	public static boolean strongNumber(int a) {
		int temp=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			a=a/10;
		}
		if(sum==temp) {
			return true;
		}
		else
			return false;
	}
}