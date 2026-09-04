import java.util.Scanner;

public class MakeMultiple {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int d=b-a;
            if(d==0 || a<=d){System.out.println("YES");}
            else{System.out.println("NO");;}
        }
	}
}
