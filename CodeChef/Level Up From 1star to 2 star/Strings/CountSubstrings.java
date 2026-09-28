import java.util.*;
public class CountSubstrings {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
           // int n=sc.nextInt();
            String s=sc.next();
            int k=0;
            for(char c:s.toCharArray()){if(c=='1') k++;}
            System.out.println((long)(k*(k+1))/2);
        }
    }
}
