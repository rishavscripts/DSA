import java.util.*;
public class ShoeFit {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=0,b=0;
            int[] arr=new int[3];
            for(int i=0;i<3;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0) a++;
                else b++;
            }
            if(a==3 || b==3 ){System.out.println(0);}
            else{System.out.println(1);}
        }
    }
}
