import java.util.*;
public class Attendance {
    static Scanner sc = new Scanner(System.in);
    static class Student {
        String first;
        String last;

        Student(String first, String last) {
            this.first = first;
            this.last = last;
        }
    }

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            Student[] students = new Student[n];
            HashMap<String, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {

                String first = sc.next();
                String last = sc.next();

                students[i] = new Student(first, last);

                freq.put(first, freq.getOrDefault(first, 0) + 1);
            }

            for (int i = 0; i < n; i++) {

                if (freq.get(students[i].first) > 1) {
                    System.out.println(students[i].first + " " + students[i].last);
                } else {
                    System.out.println(students[i].first);
                }
            }
        }
    }
}
