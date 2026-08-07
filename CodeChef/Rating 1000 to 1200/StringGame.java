import java.util.HashMap;
import java.util.Scanner;

public class StringGame {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            if(game(s,n)){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
	public static boolean game(String s, int n){
	    char[] arr=s.toCharArray();
	    HashMap<Character,Integer> map= new HashMap<>();
	    for(char c:arr){
	        map.put(c,map.getOrDefault(c,0)+1);
	    }
	    boolean flag=true;
	    for(Character c : map.keySet()){
	        if(map.get(c)%2!=0){flag=false;}
	    }
	    return flag;
	}
}
