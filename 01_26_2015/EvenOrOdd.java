/*
 * EvenOrOdd.java
 * Determines if the first argument given is odd or even.
 */

public class EvenOrOdd {
    public static void main(String[] args) {
        int firstArg = Integer.parseInt(args[0]);
        if (firstArg % 2 == 0) {
            System.out.println(firstArg + " is even.");
        } else {
            System.out.println(firstArg + " is odd.");
        }
    }
}