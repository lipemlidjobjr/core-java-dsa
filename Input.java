/**
 * Learning User Input in Java
 *
 * @author lipemlidjobjr
 * @date 2026-11-16
 */
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");

        sc.close();
    }
}