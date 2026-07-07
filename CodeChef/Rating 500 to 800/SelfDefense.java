import java.util.*;
public class SelfDefense {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] age=new int[n];
            for(int j=0;j<n;j++){age[j]=sc.nextInt();}
            int count=0;
            for(int j=0;j<n;j++){
                if(age[j]>=10&&age[j]<=60){count++;}
            }
            System.out.println(count);
        }
    }
}
