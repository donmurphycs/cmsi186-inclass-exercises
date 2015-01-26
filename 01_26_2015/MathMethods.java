/*
 * MathMethods.java
 * Several math methods for integers.
 */

public class MathMethods {
    public static void main (String[] args) {
        int firstArg = Integer.parseInt(args[0]);
        System.out.println("Factorial of " + firstArg + ": " + factorial(firstArg));
        System.out.println("Square of " + firstArg + ": " + square(firstArg));
    }
    
    // Returns the factorial of the given integer
    public static int factorial (int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result = result * i;
        }
        return result;
        // There are issues with this method. What are they?
    }
    
    // Returns the square of the given integer
    public static int square (int n) {
        return n * n;
    }
}