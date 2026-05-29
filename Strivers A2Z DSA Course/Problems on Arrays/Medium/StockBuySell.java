public class StockBuySell{
    public static void main(String[] args){
        int[] arr={10, 7, 5, 8, 11, 9};
        int ans=stock(arr);
        System.out.println(ans);
    }
    public static int stock(int[] arr){
        int size=arr.length;
        int ans=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[j]>arr[i]){
                    //System.out.println(arr[j]-arr[i]);
                    ans=Math.max(ans,(arr[j]-arr[i]));
                }
            }
        }      
        
        return ans;
    }
}