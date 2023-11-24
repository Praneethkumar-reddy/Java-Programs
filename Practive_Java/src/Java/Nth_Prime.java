package Java;
import java.util.Scanner;
public class Nth_Prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the nth num: ");
		int a=s.nextInt();
		int n=1;int i;
		int count=0;
		while(count<a) {
			n=n+1;
			for(i=2;i<=n;i++) {
				if(n%i==0) {
					break;
				}
			}
			if(i==n) {
				count++;
			}
		}
		System.out.println(n);		
	}
}