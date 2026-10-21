import java.util.Scanner;

public class FullBarrierAlchemist {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int l = sc.nextInt();
            
            int barriersPassed = 0;
            boolean exhausted = false;
            
            for(int i = 0; i < n; i++) {
                int type = sc.nextInt();
                int x = sc.nextInt();
                if(!exhausted) {
                    if(type == 1) {
                        if(x < h - y1) {l--;}
                    } else {if(x > y2) {l--;}
                    }
                    if(l == 0) {
                        exhausted = true;
                    } else {
                        barriersPassed++;
                    }
                }
            }
            
            System.out.println(barriersPassed);
        }
    }
}
