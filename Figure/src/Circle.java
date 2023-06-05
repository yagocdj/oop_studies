

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type in the radius of the circle:");
		double radius = input.nextDouble();
		final double PI = 3.14;
		input.close();

		double area = PI * Math.pow(radius, 2);
		
		System.out.println("A = " + area);
	}
}
