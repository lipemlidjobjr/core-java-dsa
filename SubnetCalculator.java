/**
 * Calculates the Network ID of an IP address using raw Bitwise Math.
 *
 * @author lipemlidjob
 * @date 2026-10-23
 */
public class SubnetCalculator {
	public static void main(String[] args) {
		long o1 = 192;
		long o2 = 168;
		long o3 = 1;
		long o4 = 10;

		long ip = (o1 << 24) | (o2 << 16) | (o3 << 8) | o4;

		long m1 = 255, m2 = 255, m3 = 255, m4 = 0;

		long mask = (m1 << 24) | (m2 << 16) | (m3 << 8) | m4;

		long networkId = ip & mask;

		long r1 = (networkId >> 24) & 255;
		long r2 = (networkId >> 16) & 255;
		long r3 = (networkId >> 8) & 255;
		long r4 = networkId & 255;

		System.out.println("Network ID: " + r1 + "." + r2 + "." + r3 + "." + r4);
	}
}
