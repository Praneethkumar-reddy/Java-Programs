package Java;
public class Duplicates_String {
	public static void main(String[] args) {
		String sen="Happy Deepavali Festival to all of you";
		int count;
		char[] letters=sen.toCharArray();
		for(int i=0;i<letters.length;i++) {
			count=1;
			for(int j=i+1;j<letters.length;j++) {
				if(letters[i]==letters[j] && letters[i]!=' ') {
					count++;
					letters[j]='0';
				}
			}
			if(count>1 && letters[i]!='0' ) {
				System.out.print(letters[i]+",");
			}
		}
	}
}