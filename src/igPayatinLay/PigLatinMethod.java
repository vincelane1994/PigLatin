package igPayatinLay;



public class PigLatinMethod {
	//METHODS 
	public static String capitalize(String finalPhrase) {
		String firstLetter = finalPhrase.substring(0, 1).toUpperCase();
		String rest = finalPhrase.substring(1);
		finalPhrase = firstLetter + rest;
		return finalPhrase;
	}
	public static String translatedPhrase(String[] words) {
		String newString = "";
		int i = 0;
		String punctuation = "";
		
		while ( i < words.length) {
			if( isPunctuation(words[i])) {
				punctuation = words[i].substring(words[i].length() -1);
				words[i] = words[i].substring(0, words[i].length() -1);
			}else {
				punctuation = "";
			}
			newString = newString + translatedWord(words[i]) + punctuation + " ";
			

			i++;
		}
		return newString;
		
	}
	public static String translatedWord(String word) {
		String newString = "";
		
		if(doTranslate(word)) {
			newString = toPigLatin(word);
		}else {
			newString = word;
		}
		return newString;
	}
	public static boolean doTranslate(String word) {
		boolean translate;
		if (word.indexOf("@") == -1
				&& word.indexOf("0") == -1
				&& word.indexOf("1") == -1
				&& word.indexOf("2") == -1
				&& word.indexOf("3") == -1
				&& word.indexOf("4") == -1
				&& word.indexOf("5") == -1
				&& word.indexOf("6") == -1
				&& word.indexOf("7") == -1
				&& word.indexOf("8") == -1
				&& word.indexOf("9") == -1
				&& word.indexOf(".com") == -1) {
			translate = true;
		}else {
			translate = !true;
		}
		return translate;
	}
	public static String toPigLatin(String word) {
		String firstLetters = "";
		String rest = "";
		//String word1 = word;
		String translatedWord;
		int i = 0;
		
		if (isConsonant(word.charAt(i))) {

			while (i < word.length() && isConsonant(word.charAt(i))) {
				firstLetters = firstLetters + word.substring(i, i + 1);
				i++;
			}
			rest = word.substring(i);
			translatedWord = rest + firstLetters + "ay";
			
			
		} else {
			translatedWord = word + "way";
		}
		return translatedWord;
	}
	public static boolean isConsonant(char letter) {
		boolean consonant = true;
		if (letter == 'a'
				|| letter == 'e'
				|| letter == 'i'
				|| letter == 'o'
				|| letter == 'u') {
			consonant = !true;
		}else {
			consonant = true;
		}
		return consonant;
	}
	public static boolean isPunctuation(String userInput) {
		char c = userInput.charAt(userInput.length() -1);
		
		return c == ','
			|| c == '.'
			|| c == '!'
			|| c == '?'
			|| c == ';'
			|| c == ':'
				;
					 
	}
}
