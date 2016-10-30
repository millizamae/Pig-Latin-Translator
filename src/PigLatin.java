import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// goal: translate English words into Pig Latin

		// prompt user for a word
		System.out.print("Welcome to the Pig Latin Translator! \n");
		String cont;
		// take input for user's English word
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a line to be translated: ");
			String english = scan.nextLine();

			pigLatin(english.toLowerCase());

			System.out.println("Would you like to continue? y/n");
			cont = scan.next();

		} while (cont.equalsIgnoreCase("y"));
		if (!cont.equals("y")) {
			System.out.println("Goodbye!");
			
		}
	}

	public static String pigLatin(String word) {
		// declaring chars that are vowels
		char[] vowelArray = { 'a', 'e', 'i', 'o', 'u' };
		int i;
		// declare
		boolean foundVowel = false;
		// finding the index of the first vowel

		for (i = 0; i < word.length(); i++) {
			// loop through the vowels in the array for their presence
			for (char vowel : vowelArray) {
				// check whether each letter in the word is vowel or not
				if (word.charAt(i) == vowel) {
					foundVowel = true;
					break;
				}
			// testing outer loop and declare when to break 
			}
			if (foundVowel) {
				break;
			}
		}
		System.out.print(word.substring(i));
		System.out.println(word.substring(0, i) + "ay");

		return word;
	}
}
