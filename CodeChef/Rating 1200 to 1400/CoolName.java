import java.util.*;
public class CoolName {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
       for (int i = 0; i < 26; i++) {
            map.put((char)('a' + i), i + 1); 
        }
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int len=s.length();
            int sum=0;
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            for(int i=1;i<=len;i++){
                sum+=i*map.get(arr[i-1]);
            }
            System.out.println(sum);
        }
    }
}
