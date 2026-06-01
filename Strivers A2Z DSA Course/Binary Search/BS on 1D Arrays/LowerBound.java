
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
       int mid=low+(high-low)/2;
            if(arr[mid]==target){return mid;}
            else if(arr[mid]>target){high=mid-1;}
            else{low=mid+1;}      
        return low;
    }
}
