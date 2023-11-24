package Java;
public class Sum_of_Small_And_Large {
	public static void main(String[] args) {
		int[] arr= {1,44,21,12};
		int len=arr.length;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			//sum=arr[1]+arr[len-2];
		}
		//System.out.println(sum);
	}
}