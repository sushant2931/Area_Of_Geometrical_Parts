package Area_Of_Geometry;

import java.util.*;

public class Area_Of_Triangle {
	public static void main(String[] args) {
		int height;
		int base;
		int area;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the height of triangle");
		height = sc.nextInt();
		System.out.println("enter the base of triangle");
		base = sc.nextInt();
		area = (height * base);
		System.out.println("area of traingle is:" + area);
		sc.close();
	}
}
