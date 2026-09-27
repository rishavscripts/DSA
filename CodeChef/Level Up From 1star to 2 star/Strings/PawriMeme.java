import java.util.*;
public class PawriMeme {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            
            if(s.contains("party")){
                String ans=s.replace("party", "pawri");
                System.out.println(ans);
            }
        }
    }
}
