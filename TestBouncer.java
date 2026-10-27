public class TestBouncer {
	public static void main(String[] args) {
		int houseNumber = 10;
		int subnetMask = 0;

		int networkId = houseNumber & subnetMask;

		System.out.println("The House Number is: " + houseNumber);
		System.out.println("After the Bouncer: " + networkId);
	}
}
