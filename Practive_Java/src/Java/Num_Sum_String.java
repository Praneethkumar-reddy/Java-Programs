package Java;
public class Num_Sum_String {
	public static void main(String[] args) {
		int sum=0;
		String sen="ELF BENCH11 JAVASELENIUM2023";
		String s="0";
		char[] ch=sen.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				s=s+ch[i];
			}else {
				sum=sum+Integer.parseInt(s);
				s="0";
			}
		}
		sum=sum+Integer.parseInt(s);
		System.out.println(sum);
	}
}