/**
 * Calculates the Network ID of an IP address using raw Bitwise Math.
 *
 * @author lipemlidjob
 * @date 2026-10-23
 */
public class SubnetCalculator {
    public static void main(String[] args) {
        
        // 1. The IP Address: 192.168.1.10
        long o1 = 192;
        long o2 = 168;
        long o3 = 1;
        long o4 = 10;

        // 2. Glue them together into one massive 32-bit number.
        // We shift o1 left by 24 bits, o2 by 16, o3 by 8, and leave o4.
        // We use Bitwise OR (|) to glue them without overlapping.
        long ip = (o1 << 24) | (o2 << 16) | (o3 << 8) | o4;

        // 3. The Subnet Mask: 255.255.255.0
        long m1 = 255, m2 = 255, m3 = 255, m4 = 0;
        
        // YOUR TURN 1: Write the line that glues the mask together into 'long mask'
        // (Look at the 'ip' line above for the pattern)
        long mask = 
        

        // 4. THE MAGIC: The router finds the Network ID using Bitwise AND (&)
        // YOUR TURN 2: Create 'long networkId' by ANDing 'ip' and 'mask'
        long networkId = 
        

        // 5. Extract the 4 parts back out using Right Shift (>>)
        // To get the first octet back, we shift RIGHT by 24, and use '& 255' to isolate the last 8 bits.
        long r1 = (networkId >> 24) & 255;
        
        // YOUR TURN 3: Extract r2 (Hint: shift right by 16)
        long r2 = 
        
        // YOUR TURN 4: Extract r3 (Hint: shift right by 8)
        long r3 = 
        
        // YOUR TURN 5: Extract r4 (Hint: no shifting needed, just isolate with & 255)
        long r4 = 

        System.out.println("Network ID: " + r1 + "." + r2 + "." + r3 + "." + r4);
    }
}
