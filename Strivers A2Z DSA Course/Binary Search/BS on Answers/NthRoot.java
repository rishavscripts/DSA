public class NthRoot {
    public static void main(String[] args){
        int n=10,m=282475249;
        System.out.println(nthRoot(n,m));
    }
    public static int nthRoot(int n, int m){
        int ans=-1;
        if(m==0||m==1){return m;}
        //m=27,n=3
        for(int i=1;i<=m/n;i++){
            if(Math.pow(i,n)==m){ans=i;break;}
        }      
        return ans;
    }
}
