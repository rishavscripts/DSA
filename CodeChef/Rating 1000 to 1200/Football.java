import java.util.Scanner;

public class Football {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            int[] goal=new int[n];
            int[] foul=new int[n];
            for(int i=0;i<n;i++){goal[i]=sc.nextInt();}
            for(int i=0;i<n;i++){foul[i]=sc.nextInt();}
            //calculation
            for(int i=0;i<n;i++){
                int diff=goal[i]*20-foul[i]*10;
                if(diff<=0){arr[i]=0;}
                else{arr[i]=diff;}
            }
            int high=0;
            for(int i:arr){
                if(i>high){high=i;}
            }
            System.out.println(high);
        }
	}
}
