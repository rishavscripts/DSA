import java.util.*;
public class ChefandString {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0) {
            String s=sc.next();
            String left=L(s);
            String right=R(s);
            System.out.println("Left : "+left);
            System.out.println("Right: "+right);
            if(left.equals(right)){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
    public static String L(String x){
        int length=x.length();
        char[] arr= x.toCharArray(); 
        char temp=arr[0];
        for(int i=1;i<length;i++){arr[i-1]=arr[i];}
        arr[length-1]=temp;
        return new String(arr);
    }
    public static String R(String x){
        int length=x.length();
        char[] arr= x.toCharArray();
        char temp=arr[length-1];
        for(int i=length-2;i>=0;i--){arr[i+1]=arr[i];}
        arr[0]=temp;
        return new String(arr);
    }
}
