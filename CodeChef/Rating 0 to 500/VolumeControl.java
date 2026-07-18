import java.util.Scanner;

public class VolumeControl {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println((int)Math.abs(x-y));
        }
	}
}
