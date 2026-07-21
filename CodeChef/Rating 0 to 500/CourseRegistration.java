import java.util.Scanner;

public class CourseRegistration {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int m=sc.nextInt();
            int k= sc.nextInt();
            if(n+k>m){System.out.println("NO");}
            else{System.out.println("YES");}
        }
	}
}
