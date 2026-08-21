import java.util.Scanner;

public class ProcessingASring {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int sum=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(Character.isDigit(c)) sum+=Character.getNumericValue(c);
            }
            System.out.println(sum);
        }
	}
}
