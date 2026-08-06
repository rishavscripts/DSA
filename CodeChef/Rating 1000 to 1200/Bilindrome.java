import java.util.HashMap;
import java.util.Scanner;

public class Bilindrome {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(bilindrome(s,n));
        }
	}
	public static int bilindrome(String s, int n){
	    char[] arr=s.toCharArray();
	    HashMap<Character,Integer> map=new HashMap<>();
	    for(Character c:arr){
	        map.put(c,map.getOrDefault(c,0)+1);
	    }
	    for(Character c: map.keySet()){
	        if(map.get(c)>=2){return n-2;}
	    }
	    return -1;
	}
}
