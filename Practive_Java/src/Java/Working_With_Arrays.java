package Java;
import java.util.Arrays;
import java.util.Scanner;
public class Working_With_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of rows");
		int rows=s.nextInt();
		System.out.println("enter the colums");
		int colums=s.nextInt();
		int[][] a=new int[rows][colums];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print(Arrays.toString(a));
	}

}
