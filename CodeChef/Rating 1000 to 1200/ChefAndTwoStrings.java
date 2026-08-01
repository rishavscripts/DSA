import java.util.Scanner;

public class ChefAndTwoStrings {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            String s1=sc.next();
            String s2=sc.next();
            int len=s1.length();
            int max=max(s1.toCharArray(),s2.toCharArray(),len);
            int min=min(s1.toCharArray(),s2.toCharArray(),len);
            System.out.println(min+" "+max);
        }
	}
	/*
	public static int max(char[] s1, char[] s2, int n){
	    int matches=0;
	    for(int i=0;i<n;i++){
	        if(s1[i]==s2[i] && s1[i]!='?' && s2[i]!='?'){
	            matches++;}
	    }
	    return n-matches;
	}
	public static int min(char[] s1, char[] s2, int n){
	    int s1Count=0;
	    for(int i=0;i<n;i++){if(s1[i]=='?'){s1Count++;}}
	    int s2Count=0;
	    for(int i=0;i<n;i++){if(s2[i]=='?'){s2Count++;}}
	    
	    return max(s1,s2,n)-Math.max(s1Count,s2Count);
	}
	*/
	public static int max(char[] s1, char[] s2, int n){
    int maxDiff = 0;
    for(int i = 0; i < n; i++){
        if(s1[i] == '?' || s2[i] == '?'){
            maxDiff++;
        } else if(s1[i] != s2[i]){
            maxDiff++;
        }
    }
    return maxDiff;
}

public static int min(char[] s1, char[] s2, int n){
    int minDiff = 0;
    for(int i = 0; i < n; i++){
        if(s1[i] != '?' && s2[i] != '?' && s1[i] != s2[i]){
            minDiff++;
        }
    }
    return minDiff;
}
}
