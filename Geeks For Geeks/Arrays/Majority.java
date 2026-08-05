import java.util.*;
public class Majority {
    public static void main(String[] args){
        int[] arr={-5, 3, -5};
        System.out.println(majority(arr));
    }
    public static ArrayList<Integer> majority(int[] arr){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(Integer i: map.keySet()){
            if(map.get(i)>arr.length/3) a.add(i);
        }
        return a;
    }
}
