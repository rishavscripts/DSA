import java.util.Scanner;

public class ChefandGroups {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        // Check if there are test cases to process
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while(t-- > 0){
            String s = sc.next();
            // Append '0' to handle groups that extend all the way to the end of the string
            s = s + "0";
            
            int count = 0;
            // Count the occurrences of "10", which marks the end of a group of friends
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '1' && s.charAt(i + 1) == '0') {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
}
