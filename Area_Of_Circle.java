package Area_Of_Geometry;

import java.util.Scanner;

public class Area_Of_Circle {
	public static void main(String[] args) {
		int radius;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		radius = sc.nextInt();
		area = (radius * radius) * Math.PI;
		System.out.println("Area of circle is ::" + area);
		sc.close();
	}
}
