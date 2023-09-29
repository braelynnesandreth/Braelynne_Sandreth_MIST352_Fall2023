/**

 * Author: Braelynne Sandreth
 * Date: 2023-09-29
 * Assessment: Exam1B
 * Description: This program prompts the user with a welcome message, asks the user 
* for a text input, calculates and prints out the length of the provided input, 
* asks the user for a character to find in the input, and prints out the location 
* of the first occurrence of that character. The program assumes that the user 
* will always provide a character that exists in the first input.
 */

/**
 * 
 */
import java.util.Scanner;
public class Exam1B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Step 1: Display welcome message
		System.out.println("Welcome to the Character Finder Program!");
		
		//Step 2: Ask the user for text input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a text:");
		String userInput = scanner.nextLine();
		
		// Step 3: Calculate and print out the length of the provided input
		int inputLength = userInput.length(); 
		System.out.println("Length of the input: " + inputLength);
		
		//Step 4: Ask the user for a character to find in the input
		System.out.print("Please enter a character to find:");
		char charToFind = scanner.next().charAt(0);
		
		//Step 5: Find and print out the location of the first occurrence of that character
		int charIndex = userInput.indexOf(charToFind);
		System.out.println("First occurrence of '" + charToFind + "' is at index:" + charIndex);
		
		//Close the scanner
		scanner.close();
		
		
		
		

	}

}
