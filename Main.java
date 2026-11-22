/**
 * Outputs the details of a student
 *
 * @date 2026-11-10
 * @author lipemlidjobjr
 */
public class Main {
    public static void main(String[] args) {

        // ❎ variable = A reusable container for a value.
        //                           A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ---------        ---------
        //    int              string
        //    double           array
        //    char             object
        //    boolean

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        int age = 30;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forsale = false;
        boolean isOnline = true;

        System.out.println("isStudent");

        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are NOT a student");
        }

        String name = "JP Dior";
        System.out.println("Hello " + name);
    }
}