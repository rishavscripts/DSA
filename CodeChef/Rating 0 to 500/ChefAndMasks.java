import java.util.Scanner;

public class ChefAndMasks {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y = sc.nextInt();
            if(x*100>=y*10){System.out.println("Cloth");}
            else{System.out.println("Disposable");}
        }
	}
}
