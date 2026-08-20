import java.util.Arrays;
import java.util.Scanner;

public class ChefandProportion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws java.lang.Exception
    {
        // Read the four numbers into an array
        long[] arr = new long[4];
        arr[0] = sc.nextLong();
        arr[1] = sc.nextLong();
        arr[2] = sc.nextLong();
        arr[3] = sc.nextLong();
        
        // Sort the array to easily check the proportion
        Arrays.sort(arr);
        
        // Check if a : b = c : d using cross-multiplication (a * d == b * c)
        if (arr[0] * arr[3] == arr[1] * arr[2]) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
