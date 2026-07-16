import java.util.Scanner;

public class InteriorDesign {
    static Scanner sc =new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            
            System.out.println(Math.min((x1+y1),(x2+y2)));
        }
	}
}
