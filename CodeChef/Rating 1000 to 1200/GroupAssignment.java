import java.util.HashMap;
import java.util.Scanner;

public class GroupAssignment {
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
            if(poss(arr)){System.out.println("YES");;}
            else{System.out.println("NO");;}
        }
	}
	public static boolean poss(int[] arr){
	    
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for(int n:arr){
	        map.put(n,map.getOrDefault(n,0)+1);
	    }
	    boolean flag=true;
	    for(Integer key:map.keySet()){
	        if(map.get(key)%key!=0){flag=false; break;}
	    }
	    return flag;
	}
}
