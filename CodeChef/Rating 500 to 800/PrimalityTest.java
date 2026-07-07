import java.util.Scanner;
public class PrimalityTest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            double n=sc.nextDouble();
            System.out.println(isPrime(n));
        }
    }
    public static String isPrime(double n){
	    if(n==1){return "no";}
	    if(n==2 || n==3){return "yes";}
	    if(n%2==0){return "no";}
	    if(n%3==0){return "no";}
	    for(double i=5;i*i<=n;i++){
	        if(n%i==0){return "no";}
	    }
	    return "yes";
	}
}
