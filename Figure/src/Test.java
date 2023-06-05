import java.util.Scanner;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		
		// Calling methods
		// 1. Individual
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("An input: ");
		name = input.nextLine();
		name = name.toUpperCase();
		
		// 2. Chaining
		System.out.println("Another input: ");
		name = input.nextLine().toUpperCase();
		
		input.close();
		
		// Empty constructor example -> create a new empty window
		JFrame frame = new JFrame();
		
		frame.setTitle("Random Window");
		frame.setSize(800, 600);
		frame.setVisible(true);
		
		double x = new Rectangle(1, 3, 4).calculateArea();
		System.out.println("Another rectangle area: " + x);
		
		Rectangle r2 = new Rectangle(1, 3, 5);
		System.out.println(r2.calculateArea());  // 15.0
		System.out.println("It is a square? " + r2.isSquare());  // false
		
		r2.makeSquare();
		
		System.out.println(r2.calculateArea());  // 16.0
		System.out.println("It is a square? " + r2.isSquare());  // true
		
		// Exercise 1
		Rectangle r3 = new Rectangle(5);
		System.out.println(r3.calculatePerimeter());  // 20
		System.out.println(r3.calculateArea());  // 25
		
	}

}
