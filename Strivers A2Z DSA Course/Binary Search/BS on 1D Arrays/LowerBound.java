
public class LowerBound {
    public static void main(String[] args){
        int[] arr={3,5,8,15,19};
        int target=9;
        int ans=low(arr,target);
        System.out.println(ans);
    }
    public static int low(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
       while (low < high) {  
            int mid = low + (high - low) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;  
            }
        }
        return low; 
    }
}
