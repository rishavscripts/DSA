import java.util.Scanner;

public class FarAway {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
           double n=sc.nextInt();
           double m=sc.nextInt();
           //int[] a=new int[n];
           double dis=0;
           for(double i=0;i<n;i++){
               double ai=sc.nextInt();
               if(ai>m/2){dis+=Math.abs(ai-1);}
               else{dis+=Math.abs(m-ai);}
           }
           System.out.printf("%.0f",dis);
           System.out.println();
        }
	}
}
