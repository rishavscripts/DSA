import java.util.Scanner;

public class ProblemCategory {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(x>=1 && x<100) System.out.println("Easy");
            else if(x>=100 && x<200) System.out.println("Medium");
            else System.out.println("Hard");
        }
	}
}
