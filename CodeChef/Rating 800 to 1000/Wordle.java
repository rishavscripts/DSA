import java.util.Scanner;
public class Wordle {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String S=sc.next();
            String T=sc.next();
            char[] M=new char[5];

            for(int i=0;i<5;i++){
                if(S.charAt(i)==T.charAt(i)) M[i]='G';
                else M[i]='B';
            }
            String ans = new String(M);
            System.out.println(ans);
        }
    }
}