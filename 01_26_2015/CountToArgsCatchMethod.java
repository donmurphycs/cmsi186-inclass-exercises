/*
 * CountToArgsCatchMethod.java
 * Counts up to the first argument using a method.
 */

public class CountToArgsCatchMethod {
    public static void main(String[] args) {
        try {
            countTo(Integer.parseInt(args[0]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No argument provided");
        } catch (NumberFormatException e2) {
            System.out.println("Please only insert integers!");
        }
    }
    
    // Counts out to the given integer on the command line.
    public static void countTo(int maxCount) {
        for (int i = 0; i <= maxCount; i++) {
            System.out.println(i);
        }
    }
}
