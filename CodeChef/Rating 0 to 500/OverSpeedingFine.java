import java.util.Scanner;

public class OverSpeedingFine {
    static Scanner sc=new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(x<=70){System.out.println(0);}
            else if(x>70 && x<=100){System.out.println(500);}
            else{System.out.println(2000);}
        }
	}
}
