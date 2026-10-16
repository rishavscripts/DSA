import java.util.ArrayList;
import java.util.Scanner;

public class AverageArray {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> a= new ArrayList<>();
            int x=sc.nextInt();
            if (n % 2 != 0) {a.add(x);}
            int pairs = n / 2;
            for (int i = 1; i <= pairs; i++) {
                a.add(x - i);
                a.add(x + i);
            }
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i) + (i == a.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
	}
}
