import java.util.Scanner;

public class HotOrCold {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int c=sc.nextInt();
            if(c>20){System.out.println("HOT");}
            else{System.out.println("COLD");}
        }
	}
}
