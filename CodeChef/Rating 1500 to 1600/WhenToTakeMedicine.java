import java.util.*;

public class WhenToTakeMedicine {
    static Scanner sc = new Scanner(System.in);

    static int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

    static boolean isLeap(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    static int daysInMonth(int year, int month) {
        if (month == 2 && isLeap(year)) return 29;
        return monthDays[month-1];
    }

    static int[] nextDay(int y, int m, int d) {
        d++;
        if (d > daysInMonth(y,m)) {
            d = 1;
            m++;
            if (m > 12) {
                m = 1;
                y++;
            }
        }
        return new int[]{y,m,d};
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            String[] parts = s.split(":");
            int y = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int d = Integer.parseInt(parts[2]);

            int parity = d % 2; // your rule
            int count = 0;

            // doctor’s schedule: every 2 days
            int[] doctor = {y,m,d};
            int[] you = {y,m,d};

            while(true) {
                // check if your day matches doctor’s day
                if (you[0]==doctor[0] && you[1]==doctor[1] && you[2]==doctor[2]) {
                    count++;
                } else {
                    break;
                }

                // advance doctor by 2 days
                doctor = nextDay(doctor[0],doctor[1],doctor[2]);
                doctor = nextDay(doctor[0],doctor[1],doctor[2]);

                // advance you to next same-parity day
                do {
                    you = nextDay(you[0],you[1],you[2]);
                } while(you[2] % 2 != parity);
            }

            System.out.println(count);
        }
    }
}
