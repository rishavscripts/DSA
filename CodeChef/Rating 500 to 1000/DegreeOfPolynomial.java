import java.util.Scanner;
public class DegreeOfPolynomial {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int count=-1;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]!=0){count=i;}
            }
            System.out.println(count);
        }
    }
}
