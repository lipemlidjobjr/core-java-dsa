import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * DiceRoller v2: rolls a die N times based on user
 *
 * @author lipemlidjob
 * @date 2026-10-21
 */
public class DiceRoller {
	public static void main(String[] args) {
		Random diceGenerator = new Random();
		Scanner keyboard = new Scanner(System.in);
		int rollCount = 1;

		try {
			System.out.print("How many times should I roll? ");
			rollCount = keyboard.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Bro, type a number! Defaulting to 1 roll..");
		}

		for (int i = 1; i <= rollCount; i++) {
			int rollResult = diceGenerator.nextInt(6) + 1;
			System.out.println("Roll " + i + ": " + rollResult);
		}
		keyboard.close();
	}
}
