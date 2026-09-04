import java.util.*;
public class PalindromicSubstrings {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Set<Character> set=new HashSet<>();
            for(int i=0;i<a.length();i++){
                set.add(a.charAt(i));
            }
            boolean f=false;
            for(int i=0;i<b.length();i++){
                if(set.contains(b.charAt(i))){f=true; break;} 
            }
            if(f){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
