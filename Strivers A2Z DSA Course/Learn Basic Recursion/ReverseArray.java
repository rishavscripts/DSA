
public class ReverseArray {
    public static void main(String[] args){
        int n=5;
        int arr[]={1,2,3,4,5};
        reverse(arr,n);
        for(int i=0;i<n;i++){System.out.print(arr[i]+" ");}
    }
   public static void rev(int arr[], int n, int i) {
    if (i >= n / 2) return;

    int temp = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - i - 1] = temp;

    rev(arr, n, i + 1);
}

public static void reverse(int arr[], int n) {
    rev(arr, n, 0);
}
}
