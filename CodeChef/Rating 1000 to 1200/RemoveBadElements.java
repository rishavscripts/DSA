import java.util.HashMap;
import java.util.Scanner;

public class RemoveBadElements {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i: arr){
                map.put(i,map.getOrDefault(i,0)+1);
            }
            int high=0;
            for(int key: map.keySet()){
                if(map.get(key)>high){high=map.get(key);}
            }
            System.out.println(n-high);
        }
	}
}
