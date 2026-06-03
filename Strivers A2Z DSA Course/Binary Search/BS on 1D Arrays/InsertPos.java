import java.util.*;
public class InsertPos {
    public static void main(String[] args){
        int arr[] = { 1, 3, 5, 6};
        int n= 2;
        int ans=searchInsert(arr,n);
        System.out.println(ans);
    }
    public static int searchInsert(int[] arr,int n){
        int low=0, high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=n){
                ans=mid;
                high=mid-1;
            }else{low=mid+1;}
        }
        return ans;
    }
}
