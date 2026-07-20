import java.util.Scanner;

public class TVDiscount {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            
            if(a-c<b-d){System.out.println("First");}
            else if(b-d<a-c){System.out.println("Second");}
            else{System.out.println("Any");}
        }
	}
}
