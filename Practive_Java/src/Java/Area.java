package Java;
public class Area {
	public static void main(String[] args) {
		System.out.println(squareArea(4));
		System.out.println(squarePerimeter(4));
		System.out.println(areaCircle(2));
		System.out.println(circlePerimeter(6));
		System.out.println(triangleArea(3, 4));
		System.out.println(trianglePerimeter(3,4,5));
	}
	public static double squareArea(double a) {
		return a*a;
	}
	public static double squarePerimeter(double a) {
		return 4*a;
	}
	public static double areaCircle(double a) {
		final double b=3.14;
		return b*a*a;
	}
	public static double circlePerimeter(double a) {
		final double b=3.14;
		return 2*b*a;
	}
	public static double triangleArea(double a,double b) {
		return (a*b)/2;
	}
	public static double trianglePerimeter(double a,double b,double c) {
		return a+b+c;
	}
}