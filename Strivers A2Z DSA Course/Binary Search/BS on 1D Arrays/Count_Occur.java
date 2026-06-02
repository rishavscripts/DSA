public class Count_Occur {
    public static void main(String[] args){
        int[] arr={0, 0, 1, 1, 1, 2, 3};
        int target=1;
        int ans = occur(arr,target);
        System.out.println(ans);
    }
    public static int occur(int[] arr, int target){
        int low=0,high=0,count=0;
        for(int i=0;i<arr.length;i++){if(arr[i]==target){low=i;break;}}
        for(int i=arr.length-1;i>=0;i--){if(arr[i]==target){high=i;break;}}
        if(low==0 && high==0){return 0;}
        count=high-low+1;
        return count;
    } 
}
