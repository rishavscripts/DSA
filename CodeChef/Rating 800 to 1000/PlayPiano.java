import java.util.*;
public class PlayPiano {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(check(s)){System.out.println("yes");}
            else{System.out.println("no");}
        }
    }    
    public static boolean check(String s){
        for(int i=0;i<s.length()-1;i=i+2){
            if(s.substring(i, i+2).equals("AA") || s.substring(i, i+2).equals("BB") ) return false;
        }
        return true;
    }
}
