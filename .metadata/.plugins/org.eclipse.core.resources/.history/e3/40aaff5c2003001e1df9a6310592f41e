package oop_classes;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str_weight = input.nextLine();  // reading as a string to allow .
		String str_height = input.nextLine();
		
		double weight = Double.parseDouble(str_weight);
		double height = Double.parseDouble(str_height);
		
		input.close();
		
		double imc = weight / Math.pow(height, 2);
		
		if (imc < 18.5)
			System.out.println("Abaixo do normal.");
		else if (imc < 25)
			System.out.println("Normal.");
		else if (imc < 30)
			System.out.println("Acima do normal.");
		else if (imc < 35)
			System.out.println("Obesidade 1.");
		else if (imc < 40)
			System.out.println("Obesidade 2.");
		else
			System.out.println("Obesidade 3.");
		
	}
}
