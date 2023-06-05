package oop_classes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO - add the character verification
		
		Scanner input = new Scanner(System.in);
		
		String error_message = "Error -> you must type in 10 answers";
		final int number_of_questions = 10;
		
		String[] answers_sheet;
		
		while (true) {
			System.out.println("Type in the answers sheet: ");
			answers_sheet = input.nextLine().split("");
			if (answers_sheet.length == number_of_questions) {
				System.out.println("Answer's sheet: ");
				System.out.println(Arrays.toString(answers_sheet));
				break;
			}
			else System.out.println(error_message);
		}

		String[] candidate_answers;

		while (true) {
			System.out.println("Type in the candidate's answers: ");
			candidate_answers = input.nextLine().split("");
			if (candidate_answers.length == number_of_questions) {
				System.out.println("Candidate's answers: ");
				System.out.println(Arrays.toString(candidate_answers));
				break;
			}
			else System.out.println(error_message);
		}
		
		input.close();
		
		int correct_answers = 0;
		for (int i = 0; i < number_of_questions; i++) {
			if (candidate_answers[i].equalsIgnoreCase(answers_sheet[i]))
				correct_answers++;
		}
		
		System.out.println("\nQuantity of correct answers = " + correct_answers);

	}

}
