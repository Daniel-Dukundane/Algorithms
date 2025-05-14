import java.util.*;

class LongestWord {
    public static String longestWord(String sentence) {
        // This function takes a sentence as input and returns the longest word in it.
        // If there are multiple words with the same length, it returns the first one.

        // Split the sentence into words using space as a delimiter
        String[] wordsArr = sentence.split(" ");

        String longestWord = "";

        for (String word : wordsArr) {
            if (word.length() >= longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        // Test the longestWord function
        String sentence = "Hello world, this is a Daniel";
        String result = longestWord(sentence);
        System.out.println("The longest word is: " + result);

        // Test with a different sentence
        String sentence2 = "Design is fun.";
        String result2 = longestWord(sentence2);
        System.out.println("The longest word is: " + result2);

        // Test with a single word
        String sentence3 = "Hello";
        String result3 = longestWord(sentence3);
        System.out.println("The longest word is: " + result3);
    }
}