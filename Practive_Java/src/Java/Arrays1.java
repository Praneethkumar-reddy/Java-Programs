package Java;
public class Arrays1 extends RuntimeException {
	public Arrays1(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		int age=13;
		if(age>12) {
			System.out.println("eligible");
		}
		else {
			throw new Arrays1("not");
		}
	}
}