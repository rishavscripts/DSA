import java.util.Scanner;

public class CoinFlip {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int g=sc.nextInt();
            while(g-->0){
                int i=sc.nextInt();
                int n=sc.nextInt();
                int q=sc.nextInt();
                if(n%2==0){System.out.println(n/2);}
                else{
                    if(q==i){System.out.println((n-1)/2);}
                    else{System.out.println((n+1)/2);}
                }
            }
        }
	}
}
