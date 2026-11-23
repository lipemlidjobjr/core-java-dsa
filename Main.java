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

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are NOT a student");
        }

        String name = "JP Dior";
        String food = "spaghetti";
        String email = "jpmbock14@gmail.com";
        String car = "Fortuner";
        String color = "blue";

        System.out.println("Your choice is a " + color + " "+ year + " " + car);
        System.out.println("The price is: " + currency + price);
        if (forSale) {
            System.out.println("There is a " + car + " for sale.");
        } else {
            System.out.println("The " + car + " is NOT for sale.");
        }
    }
}