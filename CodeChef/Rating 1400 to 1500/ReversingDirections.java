import java.util.Scanner;

public class ReversingDirections {
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine(); // Consume the remaining newline after reading n
            
            String[] directions = new String[n];
            String[] roads = new String[n];
            
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                // Find the index of the first space to separate the action (Begin/Left/Right) from the rest
                int firstSpace = line.indexOf(' ');
                directions[i] = line.substring(0, firstSpace);
                roads[i] = line.substring(firstSpace + 1); // This includes "on Road Name"
            }
            
            // The last road becomes the first, with "Begin"
            System.out.println("Begin " + roads[n - 1]);
            
            // Process the remaining instructions in reverse order
            for (int i = n - 2; i >= 0; i--) {
                String turn = "";
                // Reverse the turn: Left becomes Right, Right becomes Left
                if (directions[i + 1].equals("Left")) {
                    turn = "Right";
                } else {
                    turn = "Left";
                }
                
                System.out.println(turn + " " + roads[i]);
            }
            
            // Print a blank line after each test case (including the last one usually accepted, but be careful with trailing newlines)
            System.out.println();
        }
    }
}
