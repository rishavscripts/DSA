
public class SqrtNum {
    public static void main(String[] args){
        int n=2025;
        int ans = floorSqrt(n);
        System.out.println(ans);
    }
    public static int floorSqrt(int n){
        if(n==0 || n==1){return n;}
        int low=0,high=n/2,ans=-1;;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(mid*mid==n){return mid;}
            else if(mid*mid<n){low=mid+1;ans=mid;}
            else{high=mid-1;}
        }
        return ans;
    }
}
