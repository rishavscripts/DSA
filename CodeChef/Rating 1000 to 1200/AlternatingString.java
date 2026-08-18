import java.util.Scanner;

public class AlternatingString {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int count0=0,count1=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0') count0++;
                if(s.charAt(i)=='1') count1++;
            }
            if(count0>count1){System.out.println(count1*2+1);}
            else if(count0<count1){System.out.println(count0*2+1);}
            else{System.out.println(count1+count0);}
        }
	}
}
