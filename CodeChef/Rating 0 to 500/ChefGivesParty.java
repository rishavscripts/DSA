import java.util.*;
public class ChefGivesParty {
    static Scanner sc = new  Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=sc.nextInt();
            if(n==(k/x)){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}
