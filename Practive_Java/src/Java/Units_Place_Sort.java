package Java;

import java.util.Arrays;

public class Units_Place_Sort {
	public static void main(String[] args) {
		 int[] arr= {12,98,45,23,74,56,87};
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]%10>arr[j]%10) {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 System.out.println(Arrays.toString(arr));
	}

}
