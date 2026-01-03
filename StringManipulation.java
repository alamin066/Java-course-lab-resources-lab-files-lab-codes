import java.util.*;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();


        int wordCount = sentence.split("\\s+").length;


        String reversedSentence = reverseWords(sentence);


        String sentenceWithoutPunctuation = sentence.replaceAll("[.,!?:;]", "");


        String normalized = sentenceWithoutPunctuation.replaceAll("\\s", "").toLowerCase();
        boolean isPalindrome = normalized.equals(new StringBuilder(normalized).reverse().toString());


        Map<Character, Integer> charFrequency = getCharacterFrequency(sentenceWithoutPunctuation);


        System.out.println("Word count: " + wordCount);
        System.out.println("Reversed sentence: \"" + reversedSentence + "\"");
        System.out.println("Sentence without punctuation: \"" + sentenceWithoutPunctuation + "\"");
        System.out.println("Is palindrome: " + isPalindrome);
        System.out.println("Character frequencies: " + charFrequency);
    }

    private static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    private static Map<Character, Integer> getCharacterFrequency(String sentence) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : sentence.toCharArray()) {
            if (c != ' ') {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }
        return frequencyMap;
    }
}
