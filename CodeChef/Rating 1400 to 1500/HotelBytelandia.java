import java.util.*;
public class HotelBytelandia {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arrival = new int[n];
            int[] departure = new int[n];
            for (int i = 0; i < n; i++) arrival[i] = sc.nextInt();
            for (int i = 0; i < n; i++) departure[i] = sc.nextInt();

            Arrays.sort(arrival);
            Arrays.sort(departure);

            int i = 0, j = 0, current = 0, maxGuests = 0;
            while (i < n && j < n) {
                if (arrival[i] < departure[j]) {
                    current++;
                    maxGuests = Math.max(maxGuests, current);
                    i++;
                } else {
                    current--;
                    j++;
                }
            }
            System.out.println(maxGuests);
        }
	}    
}
