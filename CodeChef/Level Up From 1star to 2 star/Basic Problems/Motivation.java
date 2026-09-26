import java.util.Scanner;

public class Motivation {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int maxRating = 0;
            for(int i = 0; i < n; i++){
                int s = sc.nextInt();
                int r = sc.nextInt();
                if(s <= x){
                    maxRating = Math.max(maxRating, r);
                }
            }
            System.out.println(maxRating);
        }
	}
}
