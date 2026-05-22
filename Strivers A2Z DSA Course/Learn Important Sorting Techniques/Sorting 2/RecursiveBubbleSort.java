public class RecursiveBubbleSort {
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
        int size = arr.length;
        bubbleSort(arr,size);
        for(int i =0;i<size;i++){System.out.print(arr[i]+" ");}
    }
    public static void bubbleSort(int[] arr, int n){
        if(n==1){return;}
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSort(arr,n-1);
    }
}
