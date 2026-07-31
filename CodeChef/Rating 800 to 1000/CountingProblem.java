import java.util.Scanner;

public class CountingProblem {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            boolean flag=false;
            int sum=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a%2!=0) flag=true;
                sum+=a;
            }
            if(flag && sum%2==0){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}
