package Java;
public class Max_Consecutive_Ones {
	public static void main(String[] args) {
		int[] arr= {1,1,1,0,0,0,0,1,1,0,0,0,1,1,1,1,0,0};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==1&&arr[j]==1) {
					count++;
				}
				else {
					break;
				}
			}if(count>max) {
				max=count;
			}
		}System.out.println(max);
	}
}