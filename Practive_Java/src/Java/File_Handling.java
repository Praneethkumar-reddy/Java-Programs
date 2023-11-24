package Java;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Set;

public class File_Handling {
	public static void main(String[] args) {
		
		//create a file
		
		File file=new File("C:/Users/praneeth/Desktop/Project/praneeth12345.txt");
		try {
			file.createNewFile();
		}
		catch(IOException e) {
			System.out.println("not created");
			e.printStackTrace();
		}
		
		//write a file
		
		try {
			FileWriter writer=new FileWriter(file);
			writer.write("this is my first file");
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		//read a file
		

		try {
			Scanner s=new Scanner(file);
			while(s.hasNext()) {
				String line=s.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//delete a file
		

//		if(file.delete()) {
//			System.out.println("file has been deleted");
//		}
//		else { 
//			System.out.println("file not deleted");
//		}
		
		//printing console output to a file.
		
//		try {
//			PrintStream stream=new PrintStream(new File("praneeth.txt"));
//			System.setOut(stream);
//			stream.print("hi im praneeth");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	} 
}