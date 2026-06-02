public class First_Last {
    public static void main(String[] args){
        int[] arr= {5, 7, 7, 8, 8, 10};
        int target=6;
        int[] ans=searchRange(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] searchRange(int[]arr,int target){
        int[] ans={-1,-1};
        for(int i=0;i<arr.length;i++){if(arr[i]==target){ans[0]=i;break;}}
        for(int i= arr.length-1;i>=0;i--){if(arr[i]==target){ans[1]=i;break;}}
        return ans;
    }
}
