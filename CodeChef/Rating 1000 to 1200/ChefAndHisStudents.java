import java.util.Scanner;

public class ChefAndHisStudents {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t=sc.nextInt();
		while(t-->0){
		    String s=sc.next();
		    int size=s.length();
		    System.out.println(count(s,size));
		}
	}
	public static int count(String s,int n){
	     if(n<2)return 0;
	     int c=0;
	     for(int i=0;i<=n-2;i++){
	         String temp=s.substring(i,i+2);
	         if(temp.equals("<>")){c++;}
	     }
	     return c;
	}
}
