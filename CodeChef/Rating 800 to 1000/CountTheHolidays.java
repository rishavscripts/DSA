import java.util.*;
public class CountTheHolidays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int holidays=8;
            for(int i:arr){
                if(i==6 || i==7 || i==13 || i==14 || i==20 || i==21 || i==27 || i==28){n--;}
            }
            System.out.println(holidays+n);
        }
    }
}
