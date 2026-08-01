import java.util.Scanner;

public class PseudoSortedArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            System.out.println(isPseudoSorted(arr) ? "YES" : "NO");
        }
    }

    private static boolean isPseudoSorted(int[] arr) {
        int n = arr.length;
        int breaks = 0, idx = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                breaks++;
                idx = i - 1;
                if (breaks > 1) return false;
            }
        }

        if (breaks == 0) return true; // already sorted

        // Try swapping once
        swap(arr, idx, idx + 1);
        return isSorted(arr);
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i - 1] > arr[i]) return false;
        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
    }
}
