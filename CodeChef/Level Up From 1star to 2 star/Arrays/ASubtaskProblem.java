import java.util.*;
public class ASubtaskProblem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int count=0;
            for(int i:arr){if(i==1) count++;}
            if(count==n){System.out.println(100);}
            else if(count>=m && count <n){System.out.println(k);}
            else{System.out.println(0);}
        }
    }
}
