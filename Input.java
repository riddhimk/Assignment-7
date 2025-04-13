// Input.java

import java.util.Scanner;
import java.util.InputMismatchException;

public class Input
{
    // method to take input from user
    int[] input() throws InvalidInputException
    {
        Scanner scan = new Scanner(System.in);

        try
        {
            // input numbers
            System.out.print("Enter num1: ");
            int num1 = scan.nextInt();
            System.out.print("Enter num2: ");
            int num2 = scan.nextInt();

            // create and return an array to store the numbers
            int[] nums = new int[2];
            nums[0] = num1;
            nums[1] = num2;

            return nums;
        }
        catch (InputMismatchException e)
        {
            throw new InvalidInputException("Invalid input! Enter valid number");
        }
    }
}