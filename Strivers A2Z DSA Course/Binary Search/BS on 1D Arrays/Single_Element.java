import java.util.*;
public class Single_Element {
    public static void main(String[]args){
        int[] arr={1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int ans=single(arr);
        System.out.println(ans);
    }
    public static int single(int[] arr){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int n: arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:map.keySet()){
            if(map.get(n)==1){return n;}
        }
        return -1;
    }
}
