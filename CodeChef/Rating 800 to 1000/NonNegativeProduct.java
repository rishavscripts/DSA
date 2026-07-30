import java.util.*;
public class NonNegativeProduct{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] arr= new int[n];
			for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
			int ans=check(arr,n);
			System.out.println(ans);
		}
	}
	public static int check(int[] arr,int n){
		int neg=0;
		for(int i=0;i<n;i++){
			if(arr[i]==0) return 0;
			if(arr[i]<0) neg++;
		}
		if(neg%2==0) return 0;
		else return 1;
	}
}