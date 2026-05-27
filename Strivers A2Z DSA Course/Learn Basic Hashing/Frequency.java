import java.util.*;
public class Frequency {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] arr={1, 2, 2, 1, 3};
        List<List<Integer>> ans = countFrequencies(arr);
        System.out.print(ans);
    }
    public static int count(int[] arr,int target){
        int freq=0;
        for(int n:arr){if(n==target){freq++;}}
        return freq;
    }
   
    public static List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            result.add(Arrays.asList(key, map.get(key)));
        }

        return result;
    }
}
