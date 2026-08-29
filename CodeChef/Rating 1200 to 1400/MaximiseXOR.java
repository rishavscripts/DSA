import java.util.*;
public class MaximiseXOR {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            int n=a.length();
            int a0=0,a1=0,b0=0,b1=0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)=='0') a0++;
                if(a.charAt(i)=='1') a1++;
            }
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)=='0') b0++;
                if(b.charAt(i)=='1') b1++;
            }
            int ones=Math.min(a1,b0)+Math.min(a0,b1);
           // int zeros=n-ones;
            char[] arr= new char[n];
            for(int i=0;i<ones;i++){arr[i]='1';}
            for(int i=ones;i<n;i++){arr[i]='0';}
            String result = new String(arr);
            System.out.println(result);
        }
    }
}
