import java.util.Scanner;

public class SpiceLevel {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(x<4){System.out.println("MILD");}
            else if(x>=4 && x<7){System.out.println("MEDIUM");}
            else{System.out.println("HOT");}
        }
	}
}
