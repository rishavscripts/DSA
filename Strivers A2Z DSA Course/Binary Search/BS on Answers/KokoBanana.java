import java.util.*;
public class KokoBanana {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] nums={7, 15, 6, 3};
        int h=8;

        System.out.println(minRateToEatBananas(nums,h));
    }
    public static int calculateTotalHours(int[] a, int hourly) {
        int totalHours = 0;
        for (int pile : a) {
            // Add hours using ceil
            totalHours += (int)Math.ceil((double)pile / hourly);
        }
        return totalHours;
    }

    // Function to find minimum eating speed
    public static int  minRateToEatBananas(int[] a, int h) {
        // Find maximum pile size
        int maxVal = Arrays.stream(a).max().getAsInt();

        // Try every possible speed
        for (int i = 1; i <= maxVal; i++) {
            int hours = calculateTotalHours(a, i);

            // If hours fit within h
            if (hours <= h) {
                return i;
            }
        }
        return maxVal;
    }
    
}
