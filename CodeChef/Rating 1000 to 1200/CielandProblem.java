import java.util.Scanner;

public class CielandProblem {
     static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int a=sc.nextInt();
        int b=sc.nextInt();
        int diff=a-b;
        if(diff%10==9){System.out.println(diff-1);}
        else{System.out.println(diff+1);}
	}
}
