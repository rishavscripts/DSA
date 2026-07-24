import java.util.HashMap;
import java.util.Scanner;

public class Candies {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[2*n];
            for(int i=0;i<2*n;i++){arr[i]=sc.nextInt();}
            if(check(arr,n)){System.out.println("NO");}
            else{System.out.println("YES");}
        }
	}
	public static boolean check(int[] arr,int n){
	    HashMap<Integer,Integer> map=new HashMap<>();
            for(int i: arr){
                map.put(i,map.getOrDefault(i,0)+1);
            }
            for(Integer key:map.keySet()){
                if(map.get(key)>2){return true;}
            }
            return false;
	}
}
