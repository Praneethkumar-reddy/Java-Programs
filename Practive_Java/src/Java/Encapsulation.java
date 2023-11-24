package Java;

public class Encapsulation {

	public static void main(String[] args) {

	}

}
class Student{
	private int studentID;
	private String name;
	private int standard;
	private char section;
	private double percentage;
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID=studentID;
	}
	
}