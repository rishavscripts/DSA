import java.util.Arrays;
import java.util.Scanner;

public class ChefAndSpells {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int[] a=new int[3];
            for(int i=0;i<3;i++){a[i]=sc.nextInt();}
            Arrays.sort(a);
            System.out.println(a[1]+a[2]);
        }
	}
}
