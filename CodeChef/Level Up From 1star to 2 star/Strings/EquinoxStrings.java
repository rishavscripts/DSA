import java.util.*;
public class EquinoxStrings {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sar=0, anu=0;
            for(int i=0;i<n;i++){
                String s=sc.next();
                if(s.charAt(0)=='E' || s.charAt(0)=='Q' || s.charAt(0)=='U' || s.charAt(0)=='I' || s.charAt(0)=='N' || s.charAt(0)=='O' || s.charAt(0)=='X') sar+=a;
                else anu+=b;           
            }
            if(sar>anu) System.out.println("SARTHAK");
            else if(sar<anu) System.out.println("ANURADHA");
            else System.out.println("DRAW");
        }
    }
}
