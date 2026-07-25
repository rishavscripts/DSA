import java.util.*;
public class Relativity {
    static Scanner sc = new  Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            double g=sc.nextDouble();
            double c=sc.nextDouble();
            double h=(c*c)/(2*g);
            System.out.printf("%.0f%n", h);
        }
    }
}
