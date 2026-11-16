/**
 * Learning Variables in Java
 *
 * @author lipemlidjobjr
 * @date 2026-11-16
 */
public class Variable {
    public static void main(String[] args) {
        // ❎ variable = A reusable container for a value.
        //                           A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ---------                      ---------
        //    int                            string
        //    double                         array
        //    char                           object
        //    boolean

        int age = 30;
        int year = 2025;
        int quantity = 2;

        System.out.println("The year is " + year);
    }
}