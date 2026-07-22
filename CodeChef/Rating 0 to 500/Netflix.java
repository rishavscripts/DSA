import java.util.Scanner;

public class Netflix {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int x=sc.nextInt();
            
            if(a+b>=x){System.out.println("YES");}
            else if(b+c>=x){System.out.println("YES");}
            else if(c+a>=x){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}
