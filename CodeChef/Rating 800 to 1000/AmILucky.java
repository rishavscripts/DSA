import java.util.*;
public class AmILucky{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int x=sc.nextInt();//Boys
			int k=sc.nextInt();
			int y=n-x;//girls
			int br=x%k;
			int gr=y%k;
			int read=Math.abs(br-gr);
			System.out.println(read);
		}
	}
}