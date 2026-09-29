import java.util.Arrays;
import java.util.Scanner;

public class ProgrammingLanguages {
     static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int[] ab=new int[2];
            int[] ab1=new int[2];
            int[] ab2=new int[2];
            ab[0]=sc.nextInt();
            ab[1]=sc.nextInt();
            ab1[0]=sc.nextInt();
            ab1[1]=sc.nextInt();
            ab2[0]=sc.nextInt();
            ab2[1]=sc.nextInt();
            Arrays.sort(ab);
            Arrays.sort(ab1);
            Arrays.sort(ab2);
            
            if(Arrays.equals(ab,ab1)) System.out.println(1);
            else if(Arrays.equals(ab,ab2)) System.out.println(2);
            else System.out.println(0);
        }
	}
}
