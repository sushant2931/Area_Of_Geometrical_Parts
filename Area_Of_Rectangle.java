package Area_Of_Geometry;

import java.util.*;

public class Area_Of_Rectangle {
	public static void main(String[] args) {
		double length;
		double width;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of rectangle");
		length = sc.nextDouble();
		System.out.println("Enter the Width of rectangle");
		width = sc.nextDouble();
		area = length * width;
		System.out.println("area of rectangle is:" + area);
	
	sc.close();
	}
}