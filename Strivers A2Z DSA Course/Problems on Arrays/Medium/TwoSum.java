
public class TwoSum {
    public static void main(String[] args){
        int[] arr={1, 3, 5, -7, 6, -3};
        int target=0;
        int[] ans=twoSum(arr,target);
        for(int n:ans){System.out.print(n+" ");}
    }    
    public static int[] twoSum(int[] arr,int target){
        int[] ans=new int[2];
        ans[1]=-1;ans[0]=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(sum==target){ans[0]=i;ans[1]=j;}
            }
        }
        return ans;
    }
}
