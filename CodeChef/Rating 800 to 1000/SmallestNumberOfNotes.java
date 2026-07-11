import java.util.Scanner;
public class SmallestNumberOfNotes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int[] notes={100,50,10,5,2,1};
            Double n=sc.nextDouble();
            int count=0,i=0;
            while(n>0){
                if(n>=notes[i]){count+=n/notes[i];n%=notes[i];i++;}
                else{i++;}
            }
            System.out.println(count);
        }
    }
}
