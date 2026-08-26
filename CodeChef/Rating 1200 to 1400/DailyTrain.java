import java.util.*;

public class DailyTrain {
    static Scanner sc = new Scanner(System.in);

    // Predefined compartments
    static int[][] compartments = {
        {1,2,3,4,53,54},
        {5,6,7,8,51,52},
        {9,10,11,12,49,50},
        {13,14,15,16,47,48},
        {17,18,19,20,45,46},
        {21,22,23,24,43,44},
        {25,26,27,28,41,42},
        {29,30,31,32,39,40},
        {33,34,35,36,37,38}
    };

    public static void main(String[] args) {
        int X = sc.nextInt();
        int N = sc.nextInt();
        String[] cars = new String[N];
        for(int i=0;i<N;i++) cars[i] = sc.next();

        int totalWays = 0;

        for(String car : cars){
            for(int[] comp : compartments){
                int freeSeats = 0;
                for(int seat : comp){
                    if(car.charAt(seat-1) == '0') freeSeats++;
                }
                if(freeSeats >= X){
                    totalWays += nCr(freeSeats, X);
                }
            }
        }

        System.out.println(totalWays);
    }

    // nCr calculation
    public static int nCr(int n, int r){
        if(r > n) return 0;
        if(r == 0 || r == n) return 1;
        if(r > n-r) r = n-r;
        int result = 1;
        for(int i=0;i<r;i++){
            result *= (n-i);
            result /= (i+1);
        }
        return result;
    }
}
