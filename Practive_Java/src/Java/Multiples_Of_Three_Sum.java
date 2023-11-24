package Java;
public class Multiples_Of_Three_Sum {
	public static void main(String[] args) {
			int a=26;
			int b=70;
			int sum=0;
			for(int i=a;i<=b;i++) {
				if(i%3==0) {
					sum=sum+i;
				}
			}
			System.out.println(sum);
	}
}