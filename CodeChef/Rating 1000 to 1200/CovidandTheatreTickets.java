import java.util.Scanner;

public class CovidandTheatreTickets {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int r=0,s=0;
            
            if(n%2==0){r=n/2;} 
            else {r=(n+1)/2;}
            
            if(m%2==0){s=m/2;}
            else {s=(m+1)/2;}
            
            System.out.println(r*s);
        }
	}
}
