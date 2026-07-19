import java.util.Scanner;

public class ProfitIncrement {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int diff1=x-y;
            double new_x=x*1.1;
            int diff2=(int)new_x-diff1;
            System.out.println(diff2);
        }
	}
}
