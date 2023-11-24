package Java;
public class String_Num {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="praneeth123";
		char[] c=s.toCharArray();int num=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='0' && c[i]<='9') {
				num=num+c[i]-'0';
			}
		}System.out.println(num);
	}
}

//
//String s="praneeth";
//String s2=s.substring(0,s.length()/2);
//String s3="";
//for(int i=s.length()-1;i>=s.length()/2;i--) {
//	s3=s3+s.charAt(i);
//}
//System.out.println(s2+s3);