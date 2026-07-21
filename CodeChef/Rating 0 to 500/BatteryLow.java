import java.util.Scanner;

public class BatteryLow {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(x<=15){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}
