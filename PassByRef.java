import java.util.*;
public class PassByRef {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};        
        System.out.println("The array before reversing: "+Arrays.toString(arr));
        reverse(arr);
    }
    public static void reverse(int[] arr){
        int size=arr.length;
        for(int i = 0;i<size/2;i++){
            int t=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-1-i]=t;
        }
        System.out.println("The reversed arrays is: "+Arrays.toString(arr));
    }
}
