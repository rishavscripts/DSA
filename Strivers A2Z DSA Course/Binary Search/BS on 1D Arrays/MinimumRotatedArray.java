public class MinimumRotatedArray {
    public static void main(String[] args){
        int[] arr={4, 5, 6, 7, -7, 1, 2, 3};
        int ans=findMin(arr);
        System.out.println(ans);
    }
    public static int findMin(int[] arr){
        
        int ans=arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i-1]){
                ans=arr[i];
            }
        }
        return ans;
    }
}
