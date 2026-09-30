import java.util.Scanner;

public class ChefandStockPrices {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            double s=sc.nextDouble();
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            
            double newPrice=s*(1+c/100);
            if(newPrice>=a && newPrice<=b){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}
