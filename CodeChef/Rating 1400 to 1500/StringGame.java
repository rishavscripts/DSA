import java.util.Scanner;

public class StringGame {
     static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
           // int n=sc.nextInt();
            String s=sc.next();
            int one=0,zero=0;
            for(char c:s.toCharArray()){
                if(c=='0') zero++;
                else one++;
            }
            int min=Math.min(one,zero);
            if(min%2!=0) System.out.println("Zlatan");
            else System.out.println("Ramos");
        }
	}
}
