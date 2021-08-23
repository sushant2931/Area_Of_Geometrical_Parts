package Area_Of_Geometry;

import java.util.Scanner;

public class Eqilateral_Triangle {
//In geometry, an equilateral triangle is a triangle in which all three sides are equal. 
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the side of the Triangle:");
		double a = s.nextDouble();
		double area = (Math.sqrt(3) / 4) * (a * a);
		System.out.println("Area of Triangle is: " + area);
		s.close();
	}

}
