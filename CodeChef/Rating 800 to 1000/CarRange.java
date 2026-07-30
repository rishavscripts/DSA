import java.util.*;
public class CarRange{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int t=sc.nextInt();
		while(t-->0){
			int p=sc.nextInt();
			int m=sc.nextInt();
			int v=sc.nextInt();
			System.out.println((m-p+1)*v);
		}
	}
}