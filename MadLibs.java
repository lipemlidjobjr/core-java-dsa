/**
 * Coding a Mad Libs game with Java
 *
 * @author lipemlidjobjr
 * @date 2026-11-23
 */
import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args) {
        // MAD LIBS GAME
        Scanner sc = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter a descriptive adjective: ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a noun for either an animal or person: ");
        noun1 = sc.nextLine();
        System.out.print("Enter a descriptive adjective: ");
        adjective2 = sc.nextLine();
        System.out.print("Enter an action verb in the present continuous tense: ");
        verb1 = sc.nextLine();
        System.out.print("Enter a descriptive adjective: ");
        adjective3 = sc.nextLine();

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibition, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        sc.close();
    }
}