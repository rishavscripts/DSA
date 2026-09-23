import java.util.*;
public class VaccineDates {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here  
		int t=sc.nextInt();
		while(t-->0){
		    int d=sc.nextInt();
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    if(d<l && d<r){System.out.println("Too Early");}
		    else if(d>=l && d<=r){System.out.println("Take second dose now");}
		    else{System.out.println("Too Late");}
		}
	}
}
