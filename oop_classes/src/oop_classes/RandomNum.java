package oop_classes;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		Random raffle = new Random();
		int number;
		
		for (int i = 1; i <= 6; i++) {
			number = raffle.nextInt(59) + 1;  // This ensures that the number will be between 1 and 60
			System.out.println(number);
		}
	}
}
