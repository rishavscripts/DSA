import java.util.Scanner;

public class JourneyoftheKnight {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            if(((x1+y1)%2==0 && (x2+y2)%2==0)||((x1+y1)%2!=0 && (x2+y2)%2!=0)){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}
