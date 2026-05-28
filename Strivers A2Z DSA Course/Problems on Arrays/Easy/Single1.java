import java.util.*;
public class Single1{
    public static void main(String[] args){
        int[] arr={1, 3, 10, 3, 5, 1, 5};
        int ans=singleNumber(arr);
        System.out.println(ans);
    }
    public static int singleNumber(int[] arr){
        Map<Integer,Integer> table = new HashMap<>();
        for(int num: arr){
            table.put(num, table.getOrDefault(num, 0)+1);
        }
        int ans=0;
        for(int key: table.keySet()){
            if(table.get(key)==1){ans=key;}
        }
        return ans;
    }
}