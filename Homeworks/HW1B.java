/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;


public class HW1B {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		// Ask the user for input
        System.out.print("Enter value for num1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter value for num2: ");
        double num2 = scanner.nextDouble();
     // Perform calculations
        double sumResult = num1 + num2;
        double differenceResult = num1 - num2;
        double productResult = num1 * num2;
        double quotientResult = num1 / num2;
        
     // Display the results
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sumResult);
        System.out.println("Difference of " + num1 + " and " + num2 + " is " + differenceResult);
        System.out.println("Product of " + num1 + " and " + num2 + " is " + productResult);
        System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotientResult);

        // Close the scanner
        scanner.close();
        
        
        
        
        

        
        
        
        
		// TODO Auto-generated method stub

	}

}
