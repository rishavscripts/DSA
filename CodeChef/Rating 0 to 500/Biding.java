import java.util.Scanner;

public class Biding {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            //int[] a=new int[3];
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>b && a>c){System.out.println("Alice");}
            else if(b>a && b>c){System.out.println("Bob");}
            else{System.out.println("Charlie");}
        }
	}
}
