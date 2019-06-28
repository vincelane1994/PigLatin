package co.grandcircus.piglatin;

public class PigLatinMethod {
	public static boolean isConsonant(String letter) {
		boolean isConsonant;
		if (letter.equalsIgnoreCase("a")) {
			isConsonant = false;
		} else if (letter.equalsIgnoreCase("e")) {
			isConsonant = false;
		} else if (letter.equalsIgnoreCase("i")) {
			isConsonant = false;
		} else if (letter.equalsIgnoreCase("o")) {
			isConsonant = false;
		} else if (letter.equalsIgnoreCase("u")) {
			isConsonant = false;
		} else {
			isConsonant = true;
		}

		return isConsonant;

	}

	public static String translateToPigLatin(String userInput) {
		
		
		String firstLetters = "";
		String wordProgress = "";
		String word;
		int i = 0;
		firstLetters = userInput.substring(i, i + 1);
		String nextLetter = userInput.substring(i, i + 1);
		if (isConsonant(nextLetter)) {
			do {
				firstLetters = userInput.substring(i, i + 1);
				i++;
				nextLetter = userInput.substring(i, i + 1);
				if (isConsonant(firstLetters) && isConsonant(nextLetter) != true) {
					if (isConsonant(nextLetter)) {
						wordProgress = firstLetters;
						i++;
					}
				} else if (isConsonant(firstLetters) && isConsonant(nextLetter)) {
					wordProgress = wordProgress + firstLetters;
				}
			} while (isConsonant(nextLetter) == true);
			word = userInput.substring(i) + wordProgress + firstLetters + "ay";
		} else {
			word = userInput + "way";
		}
		//System.out.println(word);
		return word;
	}

	public static boolean isThereAnotherWord(String userInput) {
		boolean anotherWord;
		int i = userInput.indexOf(' ');
		int locOfLetterAfterSpace = userInput.charAt(i + 1);
		if (i != -1 && locOfLetterAfterSpace != -1) {
			anotherWord = true;
		} else {
			anotherWord = false;
		}

		return anotherWord;

	}

	public static String whatIsNextWord(String userInput) {
		String nextWord;

		int i = userInput.indexOf(" ");
		nextWord = userInput.substring(i + 1);
		// System.out.println(nextWord);

		return nextWord;
	}

	public static String seperateFirstWord(String userInput) {
		int i = userInput.indexOf(" ");
		String nextWord;
		nextWord = userInput.substring(0, i);

		return nextWord;

	}

	public static String capitalize(String newString) {

		String firstLetter;
		String rest;

		newString = newString.toLowerCase();
		firstLetter = newString.substring(0, 1).toUpperCase();
		rest = newString.substring(1).toLowerCase();
		newString = firstLetter + rest;
		return newString;
	}
}
