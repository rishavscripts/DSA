import java.util.Scanner;
public class GradeTheSteel {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            double hardness=sc.nextDouble();
            double carbon=sc.nextDouble();
            double tensile=sc.nextDouble();
            Boolean h=hardness>50;
            Boolean c=carbon<0.7;
            Boolean ts=tensile>5600;

            if(h&&c&&ts){System.out.println(10);}
            else if(h&&c&&!ts){System.out.println(9);}
            else if(c&&ts&&!h){System.out.println(8);}
            else if(h&&ts&&!c){System.out.println(7);}
            else if(h||c||ts){System.out.println(6);}
            else{System.out.println(5);}
        }
    }
}
