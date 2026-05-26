import java.util.*;
public class UnionArray {
    public static void main(String[] args){
        int[] arr1={3, 4, 6, 7, 9, 9};
        int[] arr2={1, 5, 7, 8, 8};
        int[] arr=union(arr1,arr2);
        for(int n:arr){System.out.print(n+" ");}
    }
    public static int[] union(int[] arr1, int[] arr2){
    Set<Integer> set = new HashSet<>();
    
    for(int n : arr1) set.add(n);
    for(int n : arr2) set.add(n);
    
    ArrayList<Integer> temp = new ArrayList<>(set);
    Collections.sort(temp);  // Optional: if you want sorted output
    
    int[] array = new int[temp.size()];
    for(int i = 0; i < temp.size(); i++){
        array[i] = temp.get(i);
    }
    return array;
}
}
