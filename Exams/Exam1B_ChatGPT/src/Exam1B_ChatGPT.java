/**
 * 
 */

/**
 * Author: ChatGPT
 * Date: 2023-09-29
 * Assessment: Exam1B
 * Description: This program prompts the user with a welcome message, asks the user 
* for a sentence, calculates and prints out the number of words in the sentence, 
* asks the user for a character to count in the sentence, and prints out the 
* number of occurrences of that character in the sentence. The program assumes 
* that the user will always provide a character that exists in the sentence.
 */
import java.util.Scanner;

public class Exam1B_ChatGPT {
    public static void main(String[] args) {
        // Step 1: Display welcome message
        System.out.println("Welcome to the Sentence Analyzer Program!");

        // Step 2: Ask the user for a sentence
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();

        // Step 3: Calculate and print out the number of words in the sentence
        String[] words = sentence.split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words in the sentence: " + wordCount);

        // Step 4: Ask the user for a character to count in the sentence
        System.out.print("Please enter a character to count: ");
        char charToCount = scanner.next().charAt(0);

        // Step 5: Count and print out the number of occurrences of that character in the sentence
        int charCount = 0;
        for (char c : sentence.toCharArray()) {
            if (c == charToCount) {
                charCount++;
            }
        }
        System.out.println("Number of occurrences of '" + charToCount + "': " + charCount);

        // Close the scanner
        scanner.close();
    }
	}


