public class kandane {
    public static void main(String[] args){
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int ans=maxSum(arr);
        System.out.println(ans);
    }
    public static int maxSum(int[] arr){
        int max = arr[0];
        int current = arr[0];
        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }
        return max;
    }
}
