import java.util.*;
public class BatteryHealth {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
	{
		
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(x<80){System.out.println("NO");}
            else{System.out.println("YES");}
        }
	}
}
