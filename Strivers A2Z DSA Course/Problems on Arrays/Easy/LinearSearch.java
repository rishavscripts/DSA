import java.util.*;
public class LinearSearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] arr={2, 3, 4, 5, 3};
        int target=sc.nextInt();
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){return i;}
        }
        return -1;
    }
}
