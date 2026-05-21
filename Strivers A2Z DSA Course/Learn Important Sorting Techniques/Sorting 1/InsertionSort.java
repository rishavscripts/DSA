
public class InsertionSort {
    public static void main(String[] args){
        int[]arr = {5,4,3,2,1};
        int ans[] = insertionSort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }    
    public static int[] insertionSort(int[] arr){
        int size= arr.length;
        for(int i=1;i<size;i++){
            for(int j=i;j>0&&arr[j-1]>arr[j];j--){
                int t=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
            }
        }
        return arr;
    }
}
