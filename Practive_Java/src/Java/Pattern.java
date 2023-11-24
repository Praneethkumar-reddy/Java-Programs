package Java;
public class Pattern {
	public static void main(String[] args) {
		int min=1;
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=min;k++) {
				System.out.print("*");
			}
			min+=2;
			System.out.println();
		}
	}
}