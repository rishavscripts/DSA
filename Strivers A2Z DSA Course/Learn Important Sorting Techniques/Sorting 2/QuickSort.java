public class QuickSort {
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        int size=arr.length;
        int ans[]=quick(arr,0,size-1);
        for(int i=0;i<ans.length;i++){System.out.print(ans[i]+" ");}       
        }
        public static int[] quick(int[] arr,int low,int high){
            if(low<high){
                int pi=partition(arr,low,high);
                quick(arr,low,pi-1);
                quick(arr,pi+1,high);
            }
            return arr;
        }
        public static int partition(int[] arr,int low,int high){
            int pivot=arr[low];
            int i=low;
            int j=high;
            while(i<=j){
                while(i<=high && arr[i]<=pivot){i++;}
                while(j>=low && arr[j]>pivot){j--;}
                if(i<j){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;            
            return j;
        }
}
