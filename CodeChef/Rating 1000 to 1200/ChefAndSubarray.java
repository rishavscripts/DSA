import java.util.Scanner;

public class ChefAndSubarray {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
        int max=0;int temp=0;
        for(int t:arr){
            if(t==0) temp=0;
            else{temp++; if(temp>max){max=temp;}}
        }
        System.out.println(max);
	}
}
