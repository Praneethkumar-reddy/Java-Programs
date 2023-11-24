package Java;
public class String_Rev {
	public static void main(String[] args) {
		String sen="Advanced Selenium";
		String[] words=sen.split(" ");
		String rev="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			for(int j=word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
			}
			rev=rev+" ";
		}
		System.out.print(rev);
	}
}