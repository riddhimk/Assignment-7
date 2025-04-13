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

