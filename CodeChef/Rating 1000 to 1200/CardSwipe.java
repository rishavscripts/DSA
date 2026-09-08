import java.util.*;
public class CardSwipe{
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] id=new int[n];
            for(int i=0;i<n;i++){id[i]=sc.nextInt();}
            
            Set<Integer> set= new HashSet<>();
            int max=0;
            for(int i:id){
                if(!set.contains(i)){
                    set.add(i);
                    max=Math.max(max,set.size());
                }
                else{
                    set.remove(i);
                    max=Math.max(max,set.size());
                }
            }
            System.out.println(max);
        }
	}
}