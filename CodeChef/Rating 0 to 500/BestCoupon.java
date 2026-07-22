import java.util.Scanner;

public class BestCoupon {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            double x=sc.nextInt();
            if(x*0.1>100){System.out.println((int)(x*0.1));}
            else{System.out.println(100);}
        }
	}
}
