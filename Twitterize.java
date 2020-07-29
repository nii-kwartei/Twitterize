import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

/**
 * MIT License (http://choosealicense.com/licenses/mit/)
 * 
 * MindReader: Twitterize
 * 
 * In Twitter, you are allowed only 140 characters to express your thoughts. To
 * be able to use these 140 characters as effectively as possible we derived the
 * following "compression" scheme, inspired by the words i18n and l10n:
 * 
 * from a given word take the first and the last letter, then count the number
 * of letter between the first and the last letter, finally, create a new string
 * consisting of the first letter, the number of characters in between and the
 * last letter.
 * 
 * For instance, the world "internationalization" thus becomes "i18n" and the
 * word "lano" becomes "l2o".
 * 
 * @see http://www.VariationenZumThema.de/
 * @author Khen Brian N. K. Quartey
 */
public class Twitterize extends ConsoleProgram {

	private String sentence;
	private String word;

	public void run() {

		// program loop
		while (true) {
			getSentence();
			splitIntoWords();
		}
	}

	// split words
	private void splitIntoWords() {
		String split[] = sentence.split(" ", 0);
		for (String s : split)
			print(twitterizeWords(s) + " ");
	}

	// twitterize the words
	private String twitterizeWords(String twitterize) {
		String tWord;
		if (twitterize.length() == 1) {
			tWord = twitterize;
		} else {
			String middleLetters = Integer.toString(twitterize.length() - 2);
			char firstLetter = twitterize.charAt(0);
			char lastletter = twitterize.charAt(twitterize.length() - 1);

			tWord = firstLetter + middleLetters + lastletter;
		}
		return tWord;
	}

	// get input
	private void getSentence() {
		sentence = readLine("\nEnter a sentence: ");
	}

}
