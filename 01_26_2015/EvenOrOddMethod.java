/*
 * EvenOrOddMethod.java
 * Determines if the first argument given is odd or even using several methods
 */

public class EvenOrOddMethod {
    public static void main(String[] args) {
        if (isEven(getFirstArg(args))) {
            System.out.println(getFirstArg(args) + " is even.");
        } else {
            System.out.println(getFirstArg(args) + " is odd.");
        }
    }
    
    // Returns true if a given integer is even
    public static boolean isEven(int givenInteger) {
        return givenInteger % 2 == 0;
    }
    
    // Returns an integer parsed from the first string of an array
    public static int getFirstArg(String[] args){
        return Integer.parseInt(args[0]);
    }
}