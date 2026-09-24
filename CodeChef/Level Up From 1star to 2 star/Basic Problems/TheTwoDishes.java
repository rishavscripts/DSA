import java.util.Scanner;

public class TheTwoDishes {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            if (s <= n) {
                System.out.println(s);
            }else{System.out.println((2*n)-s);}
        }
	}
}
