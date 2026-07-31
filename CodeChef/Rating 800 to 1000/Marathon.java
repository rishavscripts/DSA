import java.util.*;
public class Marathon{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		int t=sc.nextInt();
		while(t-->0){
			int d=sc.nextInt();
			int D=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int cover=d*D;
			if(cover>=42){System.out.println(c);}
			else if(cover>=21 && cover<42){System.out.println(b);}
			else if(cover>=10 && cover<21){System.out.println(a);}
			else{System.out.println(0);}			
		}
		
	}
}