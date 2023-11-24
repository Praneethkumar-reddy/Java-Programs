package Java;
public class Prime_Num_range {
	public static void main(String[] args) {
		int a=5;
		int b=35;
		int sum=0;
		for(int i=a;i<=b;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				sum=sum+i;
			}
		}System.out.println(sum);
	}
}