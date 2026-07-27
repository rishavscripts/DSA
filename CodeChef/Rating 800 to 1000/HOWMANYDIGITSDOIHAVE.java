import java.util.Scanner;

public class HOWMANYDIGITSDOIHAVE {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(length(n)==1){System.out.println(1);}
            else if(length(n)==2){System.out.println(2);}
            else if(length(n)==3){System.out.println(3);}
            else if(length(n)>3){System.out.println("More than 3 digits");}
            else{System.out.println(0);}                
        }
    }
    public static int length(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}
