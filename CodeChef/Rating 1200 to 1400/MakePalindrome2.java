import  java.util.*;
public class MakePalindrome2 {
    static  Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
           // int n=sc.nextInt();
            String s=sc.next();
            int count0 = 0, count1 = 0;
            for(char c : s.toCharArray()){
                if(c == '0') count0++;
                else count1++;
            }
            
            // Keep the majority character
            if(count0 >= count1){
                for(int i = 0; i < count0; i++) System.out.print("0");
            } else {
                for(int i = 0; i < count1; i++) System.out.print("1");
            }
            System.out.println();
        }
    }
}
