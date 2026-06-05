import java.util.*;
public class KthMissing {
    public static void main(String[] args){
        int[] nums={3, 5, 7, 10};
        int k=6;
        System.out.println(findKthMissing(nums,k));
    }
    public static int findKthMissing(int[] nums, int k){
        int high=nums[0];
        for(int i:nums){high=Math.max(high,i);}
        ArrayList<Integer> miss= new ArrayList<>();
        for(int i=1;i<=high;i++){
            miss.add(i);
        }
        for(int i:nums){
            miss.remove(Integer.valueOf(i));
        }
        return miss.get(k-1);
    }
}
