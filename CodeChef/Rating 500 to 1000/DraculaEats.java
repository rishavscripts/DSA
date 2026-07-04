import java.util.*;
public class DraculaEats {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
           
		    if(n%7>=2)
		    {
		        System.out.println((n/7)+1);
		    }
		    else if(n%7<2)
		    {
		        System.out.println(n/7);
		    }
        }
    }
}
