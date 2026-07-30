import java.util.Scanner;

public class ZeroString {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(check(s,n));
        }
	}
	public static int check(String s, int n){
	    int s0=zeros(s);
	    int s1=ones(s);
	    return Math.min(s1,s0+1);
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
