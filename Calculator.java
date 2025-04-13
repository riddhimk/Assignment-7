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

    // method to subtract 2 numbers
    int subtraction()
    {
        return input_nums[0] - input_nums[1];
    }

    // method to multiply 2 numbers
    int multiplication()
    {
        return input_nums[0] * input_nums[1];
    }

    // method to divide 2 numbers
    double division()
    {
        // throw arithmetic exception if denominator is 0
        if(input_nums[1] == 0)
        {
            throw new ArithmeticException("Division by 0 not allowed!");
        }
        return (double)input_nums[0] / input_nums[1];
    }

