
public class CheckSorted {
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,5,4};
        System.out.println("Array 1:"+check(arr1));
        System.out.println("Array 2:"+check(arr2));
    }
    public static boolean check(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){return false;}
        }
        return true;
    }
}
