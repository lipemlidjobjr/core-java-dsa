import java.util.Random;
public class DiceRoller {
	public static void main(String[] args) {
		Random diceGenerator = new Random();
		int rollResult = diceGenerator.nextInt(6) + 1;
		System.out.println("You rolled a: " + rollResult);
	}
}
