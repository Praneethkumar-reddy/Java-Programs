package Java;
import java.util.Arrays;
public class Array_Merge {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {5,6,7,8};
		int count=0;
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			count++;
		}
		for(int j=b.length-1;j>=0;j--) {
			c[count++]=b[j];
		}
		System.out.println(Arrays.toString(c));
	}
}