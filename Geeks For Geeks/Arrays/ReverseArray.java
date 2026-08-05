
public class ReverseArray {
    public static void main(String[] args){
        int[] arr={1, 4, 3, 2, 6, 5};
        reverseArray(arr);
        for(int i:arr) System.out.print(i+" ");
    }
    public static void reverseArray(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            swap(arr,i,arr.length-1-i);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
