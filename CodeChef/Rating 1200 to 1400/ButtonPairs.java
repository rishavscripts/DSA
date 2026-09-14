import java.util.*;
public class ButtonPairs {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int even=0,odd=0;
            for(int i:arr){
                if(i%2==0) even++;
                else odd++;
            }
            System.out.println(even*odd);
        }
    }
}
