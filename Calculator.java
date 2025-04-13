// Calculator.java

public class Calculator
{
    // initialize an array
    int[] input_nums;

    // default constructor (may throw InvalidInputException in input())
    public Calculator() throws InvalidInputException {
        // create a new Input object and add numbers to the array
        Input in = new Input();
        input_nums = in.input();
    }

    // method to add 2 numbers
    int addition()
    {
        return input_nums[0] + input_nums[1];
    }

