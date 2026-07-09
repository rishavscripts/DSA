import java.util.*;
public class MileageMatters {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            double n=sc.nextDouble();
            double x=sc.nextDouble();
            double y=sc.nextDouble();
            double a=sc.nextDouble();
            double b=sc.nextDouble();

            double petrol=n*(x/a);
            double diesel=n*(y/b);

            if(petrol<diesel){System.out.println("PETROL");}
            else if(petrol>diesel){System.out.println("DIESEL");}
            else{System.out.println("ANY");}
        }
    }    
}
