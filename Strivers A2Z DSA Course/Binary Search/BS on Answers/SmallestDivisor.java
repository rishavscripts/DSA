public class SmallestDivisor {
    public static void main(String[] args){
        int[] nums={1, 2, 3, 4, 5};
        int limit=8;
        System.out.println(smallestDivisor(nums,limit));
    }
    public static int smallestDivisor(int[] nums,int limit){
        int low=1,high=Integer.MIN_VALUE,ans=-1;
        for(int i:nums){high=Math.max(high,i);}
        while(low<=high){
            int mid= low+(high-low)/2;
            int sum=0;
            for(int i:nums){
                //sum+=(i+mid-1)/mid; 
                sum+=Math.ceil((double)i/mid);
            }
            if(sum<=limit){high=mid-1;ans=mid;}
            else{low=mid+1;}
        }
        return ans;
    }
}
