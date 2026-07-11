import java.util.Scanner;
public class FourTickets {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(x*4>1000){System.out.println("NO");}
            else{System.out.println("YES");}
        }
	}
}
