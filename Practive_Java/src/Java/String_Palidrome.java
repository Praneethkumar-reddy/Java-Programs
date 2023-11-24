package Java;
import java.util.Arrays;
import java.util.HashMap;
public class String_Palidrome {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=5;
		System.out.print(a);
		System.out.print(b);
		for(int i=2;i<c;i++) {
			int d=a+b;
			System.out.print(d);
			a=b;
			b=d;
		}	
	}
}