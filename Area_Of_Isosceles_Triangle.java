package Area_Of_Geometry;

import java.util.*;

public class Area_Of_Isosceles_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter length of same sided");
		double a = sc.nextDouble();
		System.out.println("pleae enter the side2 of isoscles triangle");
		double b = sc.nextDouble();
		double area = (b / 4) * Math.sqrt((4 * a * a) - (b * b));
		System.out.println("Area of isosceles triangle is: " + area);
		sc.close();

	}
}
