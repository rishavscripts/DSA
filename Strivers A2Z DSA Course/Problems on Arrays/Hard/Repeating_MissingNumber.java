import java.util.*;
public class Repeating_MissingNumber {
    public static void main(String[] args){
        int[] arr={1, 2, 3, 6, 7, 5, 7};
        int[] ans=find(arr);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] find(int[] arr){
        int[] ans=new int[2];
        HashSet<Integer> set = new HashSet<>();
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:arr){
            set.add(i);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        for(Integer i:set){
            max=Math.max(max,i);
            if(map.get(i)>1){ans[0]=i;}
        }
        int sum=max*(max+1)/2;
        for(Integer i:set){
            sum-=i;
        }
        ans[1]=sum;
        return ans;
    }
}
