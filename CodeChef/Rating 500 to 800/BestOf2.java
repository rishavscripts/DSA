import java.util.Scanner;
public class BestOf2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int a3=sc.nextInt();
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            int b3=sc.nextInt();
            
            int s1=a1+a2+a3;
            int s2=b1+b2+b3;
            
            int min1=Math.min(a1,a2);
            int min11=Math.min(min1,a3);
            s1-=min11;
            
            int min2=Math.min(b1,b2);
            int min22=Math.min(min2,b3);
            s2-=min22;
            
            if(s1>s2){System.out.println("Alice");}
            else if(s1<s2){System.out.println("Bob");}
            else{System.out.println("Tie");}
        }
    }
}
