import java.util.Scanner;

public class LaptopRecommendation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] frequency = new int[11];

            for (int i = 0; i < n; i++) {
                int laptop = sc.nextInt();
                frequency[laptop]++;
            }

            int maxFrequency = 0;
            int answer = -1;
            int countMaximum = 0;

            for (int laptop = 1; laptop <= 10; laptop++) {
                if (frequency[laptop] > maxFrequency) {
                    maxFrequency = frequency[laptop];
                    answer = laptop;
                    countMaximum = 1;
                } else if (frequency[laptop] == maxFrequency) {
                    countMaximum++;
                }
            }

            if (countMaximum > 1) {
                System.out.println("CONFUSED");
            } else {
                System.out.println(answer);
            }
        }

        sc.close();
    }
}
