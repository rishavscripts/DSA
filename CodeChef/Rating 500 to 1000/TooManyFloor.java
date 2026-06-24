import java.util.*;
public class TooManyFloor{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            //if(Math.abs(y-x)<10){System.out.println(0);}
            int m = (((x-1)/10)+1);
	        int n = (((y-1)/10)+1);
	        System.out.println(Math.abs(m-n));
        }
    }
}