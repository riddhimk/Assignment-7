/*
Name  - Riddhim Kawdia
PRN   - 23070126106
Batch - AIML B2
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Infinite loop for calculator until user exits
        while (true)
        {
            // Display calculator menu
            System.out.println("\n======= CALCULATOR =======\n");
            System.out.println("Choose an option:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square (of num1)");
            System.out.println("6. Cube (of num1)");
            System.out.println("7. Square Root (of num1)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");

            try
            {
                // Take user input for menu choice
                int choice = scan.nextInt();

                // Exit condition
                if (choice == 8)
                {
                    System.out.println("Exiting calculator... Goodbye!");
                    break;
                }
                // If input is outside 1–7, throw exception
                else if (choice < 1 || choice > 7)
                {
                    throw new InvalidInputException("Invalid choice! Please enter a number between 1 and 7.");
                }

                // New Calculator object
                Calculator calculator = new Calculator();

                switch (choice)
                {
                    case 1:
                        // Case for Addition of two numbers
                        System.out.println("Result: " + calculator.addition());
                        break;

                    case 2:
                        // Case for Subtraction of two numbers
                        System.out.println("Result: " + calculator.subtraction());
                        break;

                    case 3:
                        // Case for Multiplication of two numbers
                        System.out.println("Result: " + calculator.multiplication());
                        break;

                    case 4:
                        // Case for Division of two numbers
                        System.out.println("Result: " + calculator.division());
                        break;

                    case 5:
                        // Case for Square of num1
                        System.out.println("Result: " + calculator.square());
                        break;

                    case 6:
                        // Case for Cube of num1
                        System.out.println("Result: " + calculator.cube());
                        break;

                    case 7:
                        // Case for Square Root of num1
                        System.out.println("Result: " + calculator.sqrt());
                        break;
                }
            }
            // Handle division by zero or sqrt of negative number
            catch (ArithmeticException e)
            {
                System.out.println("Arithmetic Error: " + e.getMessage());
            }

            // Handle invalid numeric inputs or invalid input choice
            catch (InvalidInputException e)
            {
                System.out.println("Input Error: " + e.getMessage());
            }
        }
    }
}