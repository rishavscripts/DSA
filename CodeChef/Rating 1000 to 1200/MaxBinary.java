import java.util.Scanner;

public class MaxBinary {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t = sc.nextInt();
        while(t-- > 0){
           // int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            
            StringBuilder sb = new StringBuilder(s);
            
            // If the first character is '0', change it to '1' using 1 operation
            if(sb.charAt(0) == '0') {
                sb.setCharAt(0, '1');
                k--;
            }
            
            // Append the remaining 'k' zeros to the end of the string efficiently
            for(int i = 0; i < k; i++) {
                sb.append('0');
            }
            
            System.out.println(sb.toString());
        }
	}
}
