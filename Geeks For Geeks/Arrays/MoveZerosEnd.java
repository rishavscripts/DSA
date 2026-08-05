import java.util.*;
public class MoveZerosEnd {
    public static void main(String[] args){
        int[] arr={1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroes(arr);
        for(int i:arr) System.out.print(i+" ");
    }
    public static void moveZeroes(int[] arr){
        List<Integer> newArr= new ArrayList<>();;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) newArr.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) newArr.add(arr[i]);
        }
        int j=0;
        for(int i:newArr){
            arr[j++]=i;
        } 
        newArr.clear();
    }
}
