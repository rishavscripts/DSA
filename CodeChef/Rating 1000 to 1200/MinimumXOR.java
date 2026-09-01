import java.util.Scanner;

public class MinimumXOR {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here  
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] arr = new int[n];
		    int allXor=0;
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        allXor=allXor^arr[i];
		    }
		    int min=allXor;
		    for(int i=0;i<n;i++){
		        int xor=allXor^arr[i];
		        min=Math.min(min,xor);
		    }
		    System.out.println(Math.min(allXor,min));
		}
	}
}
