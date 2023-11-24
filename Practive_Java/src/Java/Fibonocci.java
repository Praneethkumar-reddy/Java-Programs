package Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Fibonocci {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream stream=new PrintStream(new File("C:/Users/praneeth/Desktop/Project/praneeth1.txt"));
		System.setOut(stream);
		int a=0;
		int b=1;
		System.out.print(a+","+b+",");
		for(int i=2;i<5;i++) {
			int c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
	}

}
