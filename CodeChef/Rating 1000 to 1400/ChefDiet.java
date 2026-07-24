import java.util.Scanner;

public class ChefDiet {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int sum=0;
            int flag=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(sum<k){flag=i+1; break;}
                sum-=k;
            }
            if(flag==0){System.out.println("YES");}
            else{System.out.println("NO "+flag);}
        }
	}
}
