
public class UpperBound {
    public static void main(String[] args){
         int[] arr={1,2,2,3};
        int target=2;
        int ans=high(arr,target);
        System.out.println(ans);
    }
     public static int high(int[] arr, int target){
        int low = 0;
        int high = arr.length;  

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {  
                low = mid + 1;          
            } else {
                high = mid;             
            }
        }
        return low;  
    }
}
