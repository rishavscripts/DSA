public class RecursiveInsertionSort {
    public static void main(String[] args){
        int arr[]={5,4,2,3,1};
        int size=arr.length;
        insertionSort(arr,size);
        for(int i=0;i<size;i++){System.out.print(arr[i]+" ");}
    }    
    public static void insertionSort(int[] arr,int n){
        if(n<=1){return;}
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        insertionSort(arr,n-1);
    }
}
