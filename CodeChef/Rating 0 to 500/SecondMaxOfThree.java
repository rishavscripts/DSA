import java.util.*;

public class SecondMaxOfThree {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int[] arr=new int[3];
            arr[0]=sc.nextInt();
            arr[1]=sc.nextInt();
            arr[2]=sc.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
	}
}
