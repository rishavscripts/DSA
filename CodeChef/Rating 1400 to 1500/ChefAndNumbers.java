import java.util.Scanner;

public class ChefAndNumbers {
     public static int sumOfDigits(long num) {
        int sum = 0;
        while (num > 0) {
            sum += (int)(num % 10);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
       
        long n = scanner.nextLong();
        scanner.close();

        int count = 0;
        
        // We only need to check numbers from N - 97 up to N
        long start = Math.max(1L, n - 97);
        
        for (long x = start; x <= n; x++) {
            int sx = sumOfDigits(x);
            int ssx = sumOfDigits(sx);
            
            if (x + sx + ssx == n) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
