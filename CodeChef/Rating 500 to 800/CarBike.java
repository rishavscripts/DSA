import java.util.Scanner;
public class CarBike {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<y){System.out.println("BIKE");}
            else if(x>y){System.out.println("CAR");}
            else{System.out.println("SAME");}
        }
    
    }
}
