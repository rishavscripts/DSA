import java.util.Scanner;

public class InterestingXOR {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long c = scanner.nextLong();
            
            long a = 0;
            long b = 0;
            boolean firstSetBit = false;
            
            // Iterate through all possible bit positions from MSB to LSB
            for (int i = 30; i >= 0; i--) {
                long bitMask = 1L << i;
                
                // Check if the i-th bit is set in C
                if ((c & bitMask) != 0) {
                    if (!firstSetBit) {
                        // For the first set bit (MSB) of C, give 1 to A and 0 to B
                        a |= bitMask;
                        firstSetBit = true;
                    } else {
                        // For subsequent set bits of C, give 0 to A and 1 to B
                        b |= bitMask;
                    }
                } else {
                    // If the bit is unset in C, give 1 to both A and B (only if A has started)
                    if (firstSetBit) {
                        a |= bitMask;
                        b |= bitMask;
                    }
                }
            }
            
            // Print the maximum product using long to prevent integer overflow
            System.out.println(a * b);
        }
        
        scanner.close();
    }
}
