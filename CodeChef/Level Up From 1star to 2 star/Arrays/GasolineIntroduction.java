import java.util.*;
public class GasolineIntroduction {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                int f=sc.nextInt();
                sum+=f;
            }
            System.out.println(sum);
        }
    }
}
