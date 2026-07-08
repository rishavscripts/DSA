import java.util.Scanner;
public class ThePreparations {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(m>(n*k)){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
