import java.util.Scanner;

public class FirstLastDigit {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(sum(n));    
        }
	}
	public static int sum(int n){
	    int first=0,last=0,rem=0;
	    last=n%10;
	    while(n>0){rem=n%10;n/=10;}
	    first=rem;
	    return first+last;
	}
}
