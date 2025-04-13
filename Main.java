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

