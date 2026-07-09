import java.util.*;
public class CircularTrack {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int m=sc.nextInt();
            int path1to2=Math.abs(a-b);
            int path2to1=m-path1to2;
            int min=Math.min(path1to2,path2to1);
            System.out.println(min);
        }
    }
}
