import java.util.Scanner;

public class PracticeMakesPerfect {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<4;i++){
            if(arr[i]>=10){count++;}
        }
        System.out.println(count);
	}
}
