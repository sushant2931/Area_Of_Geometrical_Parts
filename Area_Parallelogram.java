package Area_Of_Geometry;

import java.util.*;

public class Area_Parallelogram {
//A parallelogram is a 4 shaped four-sided flat shaped //
	// with opposite sides are parallel and equal //
	// in length and opposite angles are same as well. //
	// Check it out the below figure, you will get an idea.//
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the height:");
		double d1 = s.nextDouble();
		System.out.println("Enter the breadth:");
		double d2 = s.nextDouble();

		double area = (d1 * d2);
		System.out.println("Area of Parallelogram is: " + area);
		s.close();

	}

}
