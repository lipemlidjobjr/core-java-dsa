import java.util.Random;

public class MyApp {
	public static void main(String[] args) {
		Random coinGenerator = new Random();
		int flipResult = coinGenerator.nextInt(2);

		if (flipResult == 0) {
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}
	}
}
