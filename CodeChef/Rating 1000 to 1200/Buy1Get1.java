import java.util.HashMap;
import java.util.Scanner;

public class Buy1Get1 {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int cost = 0;
            for (int count : map.values()) {
                cost += (count + 1) / 2; 
            }
            System.out.println(cost);
        }
	}
}
