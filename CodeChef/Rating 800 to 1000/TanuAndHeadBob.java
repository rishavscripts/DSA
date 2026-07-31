import java.util.Scanner;

public class TanuAndHeadBob {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here  
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String s=sc.next();
		    boolean indian=india(s,n);
		    boolean notIndian=foreign(s,n);
		    if(indian && !notIndian){System.out.println("INDIAN");}
		    else if(notIndian && !indian){System.out.println("NOT INDIAN");}
		    else{System.out.println("NOT SURE");}
		}
	}
	public static boolean india(String s, int n){
	    for(int i=0;i<n;i++){
	        if(s.charAt(i)=='I') return true;
	    }
	    return false;
	}
	public static boolean foreign(String s, int n){
	    for(int i=0;i<n;i++){
	        if(s.charAt(i)=='Y') return true;
	    }
	    return false;
	}
}
