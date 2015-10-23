package stringsExcerciseApplication;

import java.util.Random;

public class RandomSentence {
	private static final Random random = new Random();

	public static void main(String args[]) {
		String[] articles = {"the", "a", "one", "some", "any"};
		String[] nouns = {"boy", "girl", "dog", "town", "car"};
		String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
		String[] prepositions = {"to", "from", "over", "under", "on"};

		StringBuilder sentence = new StringBuilder();

		sentence.append(articles[random.nextInt(5)]);
		sentence.append(" ");
		sentence.append(nouns[random.nextInt(5)]);
		sentence.append(" ");
		sentence.append(verbs[random.nextInt(5)]);
		sentence.append(" ");
		sentence.append(prepositions[random.nextInt(5)]);
		sentence.append(" ");
		sentence.append(articles[random.nextInt(5)]);
		sentence.append(" ");
		sentence.append(nouns[random.nextInt(5)]);
		sentence.append(".");
		
		char firstChar = sentence.charAt(0);
		sentence.deleteCharAt(0);
		sentence.insert(0, String.valueOf(firstChar).toUpperCase());
		System.out.println(sentence.toString());
	}
}