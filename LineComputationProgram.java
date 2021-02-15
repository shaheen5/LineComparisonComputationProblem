package LineComparisonProblem;

import java.util.Scanner;
import java.lang.Math;
import java.lang.Double;

public class LineComputationProgram {
	
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc=new Scanner(System.in);
		System.out.println("Line 1 Co-ordinates:-");
		double length1=calculateLength(sc);
		System.out.println("Length of Line 1 is "+length1);
		System.out.println("Line 2 Co-ordinates:-");
		double length2=calculateLength(sc);
		System.out.println("Length of Line 2 is "+length2);
		checkEquality(length1,length2);
		compareLines(length1,length2);
	}
	
	static double calculateLength(Scanner sc) {
		System.out.println("Enter Point1 co-ordinates:-");
		System.out.println("Enter x1: ");
		double x1_coordinate=sc.nextInt();
		System.out.println("Enter y1: ");
		double y1_coordinate=sc.nextInt();
		System.out.println("Enter Point2 co-ordinates:-");
		System.out.println("Enter x2: ");
		double x2_coordinate=sc.nextInt();
		System.out.println("Enter y2: ");
		double y2_coordinate=sc.nextInt();
		return Math.sqrt((x2_coordinate-x1_coordinate)*(x2_coordinate-x1_coordinate)+(y2_coordinate-y1_coordinate)*(y2_coordinate-y1_coordinate)); 
		
		
	}
	static void checkEquality(double length1,double length2) {
		String len1=Double.toString(length1);
		String len2=Double.toString(length2);
		if (len1.equals(len2))
			System.out.println("Lines are Equal!");
		else
			System.out.println("Lines are not Equal!");
		
	}
	
	static void compareLines(double l1,double l2) {
		Double length1=Double.valueOf(l1);
		Double length2=Double.valueOf(l2);
		if(length1.compareTo(length2)==0)
			System.out.println("length1 is equal to length2!!");
		else if(length1.compareTo(length2)<0)
			System.out.println("length1 is less than length2!!");
		else
			System.out.println("length1 is greater than length2!!");
	}
}
