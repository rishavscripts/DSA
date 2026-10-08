import java.util.Scanner;

public class PlusleandMinunonArray {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long sum = 0;
            long mini = Long.MAX_VALUE;
            long maxi = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                long absVal = Math.abs(sc.nextInt());
                if (i % 2 == 0) {
                    sum += absVal;
                    mini = Math.min(mini, absVal);
                } else {
                    sum -= absVal;
                    maxi = Math.max(maxi, absVal);
                }
            }

            System.out.println(Math.max(sum, sum + 2 * (maxi - mini)));
        }
	}
}
