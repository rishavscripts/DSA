import java.util.*;
public class ChefAndSalaryPay {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            String s=sc.next();
            int total=x*ones(s)+y*consecutive(s);
            System.out.println(total);
        }
    }
    public static int ones(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
        }
        return count;
    }
    public static int consecutive(String s) {
    int maxStreak = 0;
    int currentStreak = 0;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '1') {
            currentStreak++;
            maxStreak = Math.max(maxStreak, currentStreak);
        } else {
            currentStreak = 0; // reset streak when '0' encountered
        }
    }

    return maxStreak;
}

}
