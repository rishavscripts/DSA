import java.util.Scanner;

public class Infernos {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] en=new int[n];
            for(int i=0;i<n;i++){
                en[i]=sc.nextInt();
            }
            int multi=max(en);
            int single=0;
            for(int i:en){
                single+=(x+i-1)/x;
            }
            System.out.println(Math.min(multi,single));
        }
	}
	public static int max(int[] arr){
	    int max=0;
	    for(int i:arr){
	        if(i>max) max=i;
	    }
	    return max;
	}
}
