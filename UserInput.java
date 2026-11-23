/**
 * Learning User Input in Java
 *
 * @author lipemlidjobjr
 * @date 2026-11-16
 */
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("What is your gpa? ");
        double gpa = sc.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa);


        if (isStudent) {
            System.out.println("You are enrolled as a student");
        } else {
            System.out.println("You are NOT enrolled.");
        }

        sc.close();
    }
}