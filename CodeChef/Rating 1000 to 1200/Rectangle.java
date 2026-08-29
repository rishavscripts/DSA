import java.util.Arrays;
import java.util.Scanner;

public class Rectangle {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int[] arr= new int[4];
            arr[0]=sc.nextInt();
            arr[1]=sc.nextInt();
            arr[2]=sc.nextInt();
            arr[3]=sc.nextInt();
            Arrays.sort(arr);
            if(arr[0]==arr[1] && arr[2]==arr[3]){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}
