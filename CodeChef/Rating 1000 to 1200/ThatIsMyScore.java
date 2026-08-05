import java.util.Arrays;
import java.util.Scanner;

public class ThatIsMyScore {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int[] arr=new int[8];
            Arrays.fill(arr,0);
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int p=sc.nextInt();
                int s=sc.nextInt();
                if(p<9){
                    arr[p-1]=Math.max(s,arr[p-1]);
                }
            }
            int sum=0;
            for(int i=0;i<8;i++){sum+=arr[i];}
            System.out.println(sum);
        }
	}
}
