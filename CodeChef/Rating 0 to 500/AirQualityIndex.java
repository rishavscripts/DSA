import java.util.Scanner;

public class AirQualityIndex {
    static Scanner sc = new Scanner(System.in);
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int x=sc.nextInt();
        if(x<100){System.out.println("YES");}
        else{System.out.println("NO");}
	}
}
