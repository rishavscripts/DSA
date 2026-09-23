import java.util.*;
public class ChefandIPCCertificates {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(); // number of students
        int m = sc.nextInt(); // minimum marks required
        int k = sc.nextInt(); // number of questions

        int count = 0; // number of certificates issued

        for(int i = 0; i < n; i++){
            int[] arr = new int[k];
            int sum = 0;
            for(int j = 0; j < k; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            int q = sc.nextInt(); // last answer correctness

            // Condition: total marks >= m AND last answer correct
            if(sum >= m && q == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
