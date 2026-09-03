import java.util.*;
public class DistinctCodes {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            Set<String> set= new HashSet<>();
            for(int i=0;i<n-1;i++){
                String sub=s.substring(i, i+2);
                set.add(sub);
            }
            System.out.println(set.size());
        }
    }
}
