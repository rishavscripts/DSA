import java.util.Scanner;
public class GetLowestFree {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int sum=0;
            int a=sc.nextInt(); sum+=a;
            int b=sc.nextInt(); sum+=b;
            int c=sc.nextInt(); sum+=c;
            int min1=Math.min(a,b);
            int min=Math.min(min1,c);
            sum-=min;
            System.out.println(sum);
        }
    }
}
