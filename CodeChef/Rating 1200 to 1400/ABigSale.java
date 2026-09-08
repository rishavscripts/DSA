import java.util.*;
public class ABigSale {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int total=0;
            for(int i=0;i<n;i++){
                int price=sc.nextInt();
                int quantity=sc.nextInt();
                int discount=sc.nextInt();
                double loss = price * quantity * discount * discount / 10000.0;
                total += loss;
            }
            System.out.println(total);
        }
    }
}
