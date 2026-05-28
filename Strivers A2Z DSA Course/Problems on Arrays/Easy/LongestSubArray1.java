
public class LongestSubArray1 {
    public static void main(String[] args){
        int[] arr={10, 5, 2, 7, 1, 9};
        int k=15;
        int size=longestSubArray(arr,k);
        System.out.println(size);
    }
    public static int longestSubArray(int[] arr, int k) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;

                for (int x = i; x <= j; x++) {
                    sum += arr[x];
                }

                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }
}
