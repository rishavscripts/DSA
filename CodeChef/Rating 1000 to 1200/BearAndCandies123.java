import java.util.Scanner;

public class BearAndCandies123 {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int i=1;boolean flag=true;
            while(flag){
                
                if(i%2==0){    // BOB
                    if(b<0){System.out.println("Limak"); flag=false;}else{b-=i; i++;} 
                }
                else{    //Limak
                    if(a<0){System.out.println("Bob"); flag=false;}else{a-=i; i++;}
                }
            }
        }
	}
}
