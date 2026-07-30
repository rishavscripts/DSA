import java.util.*;
public class JanmanshatFruitMarket{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int t=sc.nextInt();
		while(t-->0){
			int x=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int low=low(a,b,c);
			int mid=mid(a,b,c);
			int ans=(x-1)*low+mid;
			System.out.println(ans);
		}
	}
	public static int low(int a,int b,int c){
		if(a<b && a<c) return a;
		else if(b<a && b<c) return b;
		else return c;
	}
	public static int mid(int a,int b,int c){
		if(a<b && a>c) return a;
		else if(b<a && b>c) return b;
		else return c;
	}
}