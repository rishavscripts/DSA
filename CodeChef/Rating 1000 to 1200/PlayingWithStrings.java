import java.util.Scanner;

public class PlayingWithStrings {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String r=sc.next();
            if(check(s,r,n)){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
	 public static boolean check(String s, String r, int n) {
        int count1S = 0;
        int count1R = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') count1S++;
            if (r.charAt(i) == '1') count1R++;
        }

        return count1S == count1R;
    }
}
