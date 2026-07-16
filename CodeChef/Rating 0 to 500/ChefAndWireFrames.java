import java.util.Scanner;

public class ChefAndWireFrames {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
          int t= sc.nextInt();
          while(t-->0){
              int n= sc.nextInt();
              int m= sc.nextInt();
              int x= sc.nextInt();
              
              int ans=(2*(n+m))*x;
              System.out.println(ans);
          }
	}
}
