import java.util.Scanner;

public class ATMMachine {
    static Scanner sc=new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t =sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            for(int i=0;i<n;i++){
                if(arr[i]<=k){
                    k-=arr[i];
                    arr[i]=1;
                }
                else{
                    arr[i]=0;
                }
            }
            
            for(int i=0;i<n;i++){System.out.print(arr[i]);}
            System.out.println();
        }
        
	}
}
