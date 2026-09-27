import java.util.*;
public class ChefandFeedback {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(s.contains("010") && s.contains("101")) System.out.println("Good");
            else System.out.println("Bad");
        }
    }
}
