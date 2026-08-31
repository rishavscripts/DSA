import java.util.*;
public class CaesarCipher {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int q=sc.nextInt();
        while(q-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String t=sc.next();
            String u=sc.next();
            char[] ans=new char[n];
            // finding k value.
            int k=(t.charAt(0)-s.charAt(0)+26)%26;
            for(int i=0;i<n;i++){
                ans[i]=(char)((u.charAt(i)-'a'+k)%26+'a');
            }
            String a=new String(ans);
            System.out.println(a);
        }
    }
}
