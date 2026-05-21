public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
        int ans[] = selectionSort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] selectionSort(int[] arr){
        int size=arr.length;
        for(int j=0;j<size-1;j++){
            int min=j;
            for(int i=j+1;i<size;i++){
                if(arr[i]<arr[min]){min=i;}
            }
            if(min!=j){
                int t=arr[j];
                arr[j]=arr[min];
                arr[min]=t;
            }
        }
        return arr;
    }    
}
