import java.util.Scanner;

public class ChefAndGlove {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] finger=new int[n];
            int[] sheath=new int[n];
            for(int i=0;i<n;i++){finger[i]=sc.nextInt();}
            for(int i=0;i<n;i++){sheath[i]=sc.nextInt();}
            System.out.println(check(finger,sheath,n));
        }
	}
	public static String check(int[] finger, int[] sheath, int n){
	    boolean front=true, back=true;
	    for(int i=0;i<n;i++){
	        if(finger[i]>sheath[i]){front=false;}
	        if(finger[i]>sheath[n-i-1]){back=false;}
	    }
	    if(front && back) return "both";
	    else if(!front && back) return "back";
	    else if(front && !back) return "front";
	    else return "none";
	}
}
