import java.util.*;;
public class ChefinVaccinationQueue {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int p=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int time=0;
            for(int i=0;i<p;i++){
                if(arr[i]==0) time+=x;
                else time+=y;
            }
            System.out.println(time);
        }
    }
}
