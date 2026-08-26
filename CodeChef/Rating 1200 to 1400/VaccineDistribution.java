import java.util.*;
public class VaccineDistribution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int risk=0, safe=0;
            for(int i=0;i<n;i++){
                if(arr[i]>=80 || arr[i]<=9) risk++;
                else safe++;
            }
            int daysRisk = (risk + d - 1) / d;
            int daysSafe = (safe + d - 1) / d;
            int total = daysRisk + daysSafe;
            System.out.println(total);
        }
    }
}
