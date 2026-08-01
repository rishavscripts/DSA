import java.util.Scanner;

public class EndSorted {
     static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            System.out.println(steps(arr,n));
        }
	}
	public static int steps(int[] arr, int n){
	    int low=low(arr,n);
	    int high=high(arr,n);
	    int low_ind=index(arr,n,low);
	    int high_ind=index(arr,n,high);
	    int steps=0;
	    
	    if(low_ind>high_ind){
	        int lower_steps=low_ind;
	        int high_steps=n-high_ind;
	        steps=lower_steps+high_steps-2;
	    }
	    else{
	        int lower_steps=low_ind;
	        int high_steps=n-high_ind;
	        steps=lower_steps+high_steps-1;
	    }
	    return steps;
	}
	
	public static int low(int[] arr,int n){
	    int low=arr[0];
	    for(int i=0;i<n;i++){if(arr[i]<low){low=arr[i];}}
	    return low;
	}
	public static int high(int[] arr,int n){
	    int high=arr[n-1];
	    for(int i=0;i<n;i++){if(arr[i]>high){high=arr[i];}}
	    return high;
	}
	public static int index(int[] arr, int n,int target){
	    int index=0;
	    for(int i=0;i<n;i++){if(arr[i]==target){index=i;}}
	    return index;
	}
}

   