import java.util.*;
public class EasyPronounciation {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            if(easy(s,n)){System.out.println("NO");}
            else{System.out.println("YES");}
        }
	}
	public static boolean easy(String s, int n){
        int consCount = 0;
        for(char c : s.toCharArray()){
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                consCount++;
                if(consCount >= 4) return true;
            } else {
                consCount = 0;
            }
        }
        return false;
    }
}
