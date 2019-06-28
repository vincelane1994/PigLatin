package co.grandcircus.piglatin;

import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String userInput;
		int i = 0;
		String firstLetters;
		String nextLetter;
		String pigLatinWord;
		String letterAfterSpace;
		String nextWord;
		String translated;
		String seperatedWord;
		boolean anotherWord;

		System.out.print("Please enter a phrase to translate into pig latin: ");
		userInput = scnr.nextLine();

		userInput = userInput.toLowerCase();//Makes phrase lower case
		if(PigLatinMethod.isThereAnotherWord(userInput)) {
			nextWord = PigLatinMethod.seperateFirstWord(userInput);//Assigns nextWord with the first word in my phrase
			translated = PigLatinMethod.translateToPigLatin(nextWord);//Assigns translated with the translated version of the first word
			anotherWord = PigLatinMethod.isThereAnotherWord(userInput);		/*Assigns boolean variable anotherWord 
																			with true if there is another word in
																			the phrase and false if there is not*/
			do {
				nextWord = PigLatinMethod.whatIsNextWord(userInput);
				anotherWord = PigLatinMethod.isThereAnotherWord(nextWord);
				
				if (anotherWord == true) {
					seperatedWord = PigLatinMethod.seperateFirstWord(nextWord);
				} else {
					seperatedWord = nextWord;
				}
				
				translated = translated + " " + PigLatinMethod.translateToPigLatin(seperatedWord);
				i = userInput.indexOf(" ");
				userInput = userInput.substring(i + 1);
				anotherWord = PigLatinMethod.isThereAnotherWord(userInput);
			} while (anotherWord == true);
		}else {
			translated = PigLatinMethod.translateToPigLatin(userInput);		
		}
		pigLatinWord = PigLatinMethod.capitalize(translated);
		System.out.println(pigLatinWord);
	}
}
