public class SearchInRotatedArray2 {
    public static void main(String[] args){
        int[] arr={7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target=3;
        System.out.println(search(arr,target));
    }
    public static boolean search(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)return true;
        }
        return false;
    }
}
