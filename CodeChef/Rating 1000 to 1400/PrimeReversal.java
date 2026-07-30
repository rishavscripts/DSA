import java.util.Scanner;

public class PrimeReversal {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int a0 = zeros(a);
            int a1 = ones(a);
            int b0 = zeros(b);
            int b1 = ones(b);
            if(a0==b0 && a1==b1){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
	public static int zeros(String s){
	    int count=0;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)=='0')count++;
	    }
	    return count;
	}
	public static int ones(String s){
	    int count=0;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)=='1')count++;
	    }
	    return count;
	}
}
