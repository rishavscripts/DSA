import java.util.Scanner;

public class PendingAssignments {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            
            double timeHave=z*24*60;
            double timeReq=x*y;
            
            if(timeReq<=timeHave){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}
