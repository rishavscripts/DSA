import java.util.*;

public class Three3_Sum {
    public static void main(String[] args){
        int[] arr = {2, -2, 0, 3, -3, 5};
        List<List<Integer>> ans = threeSum(arr);
        System.out.print(ans);
    }
    
    public static List<List<Integer>> threeSum(int[] arr){
        Set<List<Integer>> ans = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int t = -(arr[i] + arr[j]);
                
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[k] == t){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        Collections.sort(triplet);  // Sort to avoid duplicates
                        ans.add(triplet);
                        break;
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}