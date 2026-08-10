import java.util.Scanner;

public class NQueensPuzzle {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t=sc.nextInt();
		while(t-->0){
		    double n=sc.nextInt();
		    double val=0.143*n;
		    int ans=power(val,n);
		    System.out.println(ans);
		}
	}
	public static int power(double val, double n){
	    double t=1;
	    for(int i=0;i<n;i++){
	        t*=val;
	    }
	    if(t-Math.floor(t)<0.5){return (int)t;}
	    else{return (int)t+1;}
	}
}
