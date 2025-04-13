# Calculator with Exception Handling

## Overview  
This Java program implements a simple **console-based calculator** that demonstrates **exception handling** through **custom and built-in exceptions**. It provides basic arithmetic operations and validates user inputs robustly.

## Features  
- Arithmetic operations:  
  - Addition  
  - Subtraction  
  - Multiplication  
  - Division  
  - Square  
  - Cube  
  - Square Root  
- **Input validation** using a custom exception: `InvalidInputException`  
- **Handles**:
  - Division by zero  
  - Square root of negative numbers  
  - Invalid menu choice  
  - Non-numeric inputs  

## Class Structure  

### `InvalidInputException.java`  
- Custom checked exception to handle invalid user inputs  
- Extends `Exception`  
- Constructor accepts and passes error message  

### `Input.java`  
- Takes input from the user using `Scanner`  
- Method:  
  - `input()`: Accepts two integers from user  
  - Throws `InvalidInputException` for non-numeric input  

### `Calculator.java`  
- Performs operations using two integers  
- Methods:  
  - `addition()`, `subtraction()`, `multiplication()`, `division()`  
  - `square()` – square of num1  
  - `cube()` – cube of num1  
  - `sqrt()` – square root of num1  
- Throws `ArithmeticException` for division by zero or negative square root  

### `Main.java`  
- Displays a **menu-driven interface** to perform operations  
- Uses **infinite loop** until user exits  
- Handles exceptions:  
  - `InvalidInputException`  
  - `ArithmeticException`  

## Sample Menu  

```text
======= CALCULATOR =======

Choose an option:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Square (of num1)
6. Cube (of num1)
7. Square Root (of num1)
8. Exit
Enter your choice (1-8): 
