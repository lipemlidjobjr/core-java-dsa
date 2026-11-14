/**
 * Creates a star pattern.
 *
 * @author lipemlidjob
 * @date 2026-11-14
 */

public class Pattern {
    public static void main(String[ ] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // print stars: 1, 3, 5, 7, 9
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}