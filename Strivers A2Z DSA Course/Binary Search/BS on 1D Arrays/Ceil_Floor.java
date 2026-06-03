public class Ceil_Floor {
    public static void main(String[] args){
        int[] arr={3, 4, 4, 7, 8, 10};
        int n=8;
        int[] ans=ceil_floor(arr,n);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] ceil_floor(int[] arr, int n){
        int floor=floor(arr,n);
        int ceil=ceil(arr,n);
        int[] ans={floor,ceil};
        return ans;
    }
    public static int floor(int[] arr ,int n){
        
        int low=0, high=arr.length-1,ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=n){
                ans=arr[mid];
                low=mid+1;
            }else{high=mid-1;}
        }
        return ans;
    }
     public static int ceil(int[] arr, int n){
        int low=0, high=arr.length-1, ans=-1;
        while(low<=high){              // ONLY ONE while loop
            int mid=low+(high-low)/2;
            if(arr[mid]>=n){
                ans=arr[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
