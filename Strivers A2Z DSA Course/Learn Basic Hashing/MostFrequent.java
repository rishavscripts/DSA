import java.util.*;
public class MostFrequent {
    public static void main(String[] args){
        int[] arr={1, 2, 2, 3, 3, 3};
        System.out.println(most(arr));
    }
   public static int most(int[] arr){
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int n : arr){
        map.put(n, map.getOrDefault(n, 0) + 1);
    } 
    
    int maxElement = arr[0];
    int maxFreq = 0;
    
    for(int key : map.keySet()){
        if(map.get(key) > maxFreq){
            maxFreq = map.get(key);
            maxElement = key;
        }
    }
    
    return maxElement;
}
}
