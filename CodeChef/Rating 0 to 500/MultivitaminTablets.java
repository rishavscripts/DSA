import java.util.Scanner;

public class MultivitaminTablets {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y>=x*3){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}
