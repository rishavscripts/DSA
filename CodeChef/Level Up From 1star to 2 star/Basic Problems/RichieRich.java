import  java.util.*;
public class RichieRich {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int ans=(b-a)/x;
            System.out.println(ans);
        }
	}    
}
