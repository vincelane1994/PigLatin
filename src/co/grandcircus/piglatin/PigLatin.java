package co.grandcircus.piglatin;

import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a phrase: ");

		String userInput = scnr.nextLine();
		String s1 = userInput.toLowerCase();
		String finalPhrase;
		String[] words = s1.split("\\s");
		
		finalPhrase = PigLatinMethod.translatedPhrase(words);
		finalPhrase = PigLatinMethod.capitalize(finalPhrase);
		System.out.println(finalPhrase);
	}
}
