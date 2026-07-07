import java.util.*;
public class Mahasena {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n];
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){evensum++;}
            else{oddsum++;}
        }
        if(evensum>oddsum){System.out.println("READY FOR BATTLE");}
        else{System.out.println("NOT READY");}

    }
}
