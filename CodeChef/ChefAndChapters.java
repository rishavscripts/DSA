import java.util.Scanner;

public class ChefAndChapters {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            System.out.println(x*y*z);
        }
	}
}
