package accessSpecifier1;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		        String inputString = "Amsterdam is amazing! I am amazed by Amsterdam.";
//		        int result = countAm(inputString);
//		        System.out.println("Number of times 'am' appears: " + result);
//		    }
//
//		    static int countAm(String str) {
//		        str = str.toLowerCase(); // Ignore case
//		        int count = 0;
//		        int index = str.indexOf("am");
//
//		        while (index != -1) {
//		            count++;
//		            index = str.indexOf("am", index + 2); // Move to the next possible position
//		        }
//
//		        return count;
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the first number (1-9):");
	        int num1 = getInput(scanner);

	        System.out.println("Enter the second number (1-9):");
	        int num2 = getInput(scanner);

	        System.out.println("Enter the third number (1-9):");
	        int num3 = getInput(scanner);

	        generateStructure(num1, num2, num3);
	    }

	    static int getInput(Scanner scanner) {
	        int input;
	        do {
	            System.out.print("Enter a number between 1 and 9: ");
	            while (!scanner.hasNextInt()) {
	                System.out.println("Invalid input. Please enter a number.");
	                scanner.next();
	            }
	            input = scanner.nextInt();
	        } while (input < 1 || input > 9);

	        return input;
	    }

	    static void generateStructure(int num1, int num2, int num3) {
	        // Printing the structure based on the input numbers
	        for (int i = 1; i <= num1; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num1);
	            }
	            System.out.println();
	        }

	        for (int i = num2; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num2);
	            }
	            System.out.println();
	        }

	        for (int i = 1; i <= num3; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num3);
	            }
	            System.out.println();
	        }
	    }
	
		    }
		
		    

	


