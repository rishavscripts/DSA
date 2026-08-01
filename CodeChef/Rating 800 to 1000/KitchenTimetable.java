import java.util.*;
public class KitchenTimetable {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            int count=0;
           int prev=0;
           for(int i=0;i<n;i++){
            int slot=a[i]-prev;
            if(slot>=b[i]){count++;}
            prev=a[i];
           }
           System.out.println(count);
        }
    }
}
