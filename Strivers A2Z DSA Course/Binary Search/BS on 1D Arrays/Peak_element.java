public class Peak_element {
    public static void main(String[] args){
        int[] arr={1, 2, 1, 3, 5, 6, 4};
        int ans=peak(arr);
        System.out.println(ans);
    }
    public static int peak(int[] arr){
        for(int i=1;i<arr.length-2;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }
}
