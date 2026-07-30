import java.util.*;
public class RearrangingDigitsMultipleof5{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int t=sc.nextInt();
		while(t-->0){
			int d=sc.nextInt();
			String n= sc.next();
			if(check(n,d)){System.out.println("YES");}
			else{System.out.println("NO");}
		}
	}
	public static boolean check(String n,int d){
		for(int i=0;i<d;i++){
			if(n.charAt(i)=='5' || n.charAt(i)=='0') return true;
		}
		return false;
	}
}