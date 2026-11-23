/**
 * Learning User Input in Java
 *
 * @author lipemlidjobjr
 * @date 2026-11-16
 */
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        // Calculate the area of a rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner wh = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = wh.nextDouble();

        System.out.println("Enter the height: ");
        height = wh.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm²");
        wh.close();
    }
}