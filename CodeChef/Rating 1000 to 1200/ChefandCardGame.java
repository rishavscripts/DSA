import java.util.Scanner;

public class ChefandCardGame {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int chef=0,smith=0;
            for(int i=0;i<n;i++){
                int ai=sc.nextInt();
                int bi=sc.nextInt();
                if(sum(ai)>sum(bi)) chef++;
                else if(sum(ai)<sum(bi)) smith++;
                else {chef++; smith++;}
            }
            if(chef>smith){System.out.println(0+" "+chef);}
            else if(chef<smith){System.out.println(1+" "+smith);}
            else{System.out.println(2+" "+chef);}
        }
	}
	public static int sum(int n){
	    int sum=0;
	    while(n>0){
	        sum+=n%10;
	        n/=10;
	    }
	    return sum;
	}
}
