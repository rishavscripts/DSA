import java.util.Scanner;

public class EncodingMessage {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String s=sc.next();
		    
		    char[] arr=s.toCharArray();
		    
		    // encoding 1
		    arr=encode1(arr,n);
		    
		    //encoding 2
		    arr=encode2(arr,n);
		    
		    s=String.valueOf(arr);
		    System.out.println(s);
		}
	}
	public static char[] encode1(char[] arr,int n){
	    if(n%2==0){
		  for(int i=0;i<n-1;i=i+2){
		    char temp=arr[i];
		    arr[i]=arr[i+1];
		    arr[i+1]=temp;
		  }
		}
		else{
		  for(int i=0;i<n-2;i=i+2){
		     char temp=arr[i];
		     arr[i]=arr[i+1];
		     arr[i+1]=temp;
		  }
		}
		return arr;
	}
	public static char[] encode2(char[] arr, int n) {
    for (int j = 0; j < n; j++) {
        arr[j] = (char) ('z' - (arr[j] - 'a'));
    }
    return arr;
}
}
