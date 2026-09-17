import java.util.HashMap;
import java.util.Scanner;

public class TrainPartner {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// HashMap mapping the first 8 berths to their partners
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "4LB"); 
		map.put(2, "5MB"); 
		map.put(3, "6UB"); 
		map.put(4, "1LB");
		map.put(5, "2MB"); 
		map.put(6, "3UB");
		map.put(7, "8SU"); 
		map.put(8, "7SL");
		
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            
            // This safely maps any positive integer N to the range [1, 8]
            int key = (n - 1) % 8 + 1;
            
            // Calculate the compartment offset (e.g., for n = 10, offset = 8)
            int offset = n - key;
            
            // Extract the numeric part and string part from the base partner
            String partnerStr = map.get(key);
            int baseNum = Integer.parseInt(partnerStr.replaceAll("[^0-9]", ""));
            String berthType = partnerStr.replaceAll("[0-9]", "");
            
            // Print the final partner berth number with its type
            System.out.println((baseNum + offset) + berthType);
        }
	}
}
