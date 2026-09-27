import  java.util.*;
public class MagicalDoors {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int count=0;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(i-1)) count++;
            }
            System.out.println(count);
        }
    }
}
