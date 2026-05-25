import java.util.*;
public class LeftRotateK {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int k=sc.nextInt();
        rotate(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int[] arr,int k){
        /*int size=arr.length;
        for(int i=0;i<size;i++){
            int t=arr[i];
            arr[i]=arr[(i-k)%size];
            arr[(i-k)%size]=t;
        }*/ // This code needs further speculation
       for(int j=0;j<k;j++){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
       }
    }
}
