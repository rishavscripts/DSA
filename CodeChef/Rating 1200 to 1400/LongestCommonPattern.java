import java.util.*;
public class LongestCommonPattern {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Set<Character> set= new HashSet<>();
            HashMap<Character,Integer> map1= new HashMap<>();
            HashMap<Character,Integer> map2= new HashMap<>();
            for(char c : a.toCharArray()){
                set.add(c);
                map1.put(c,map1.getOrDefault(c,0)+1);
            }
            for(char c:b.toCharArray()){
                set.add(c);
                map2.put(c,map2.getOrDefault(c, 0)+1);
            }
            int sum = 0;
            for (char c : set) {
                int freqA = map1.getOrDefault(c, 0);
                int freqB = map2.getOrDefault(c, 0);
                sum += Math.min(freqA, freqB);
            }
            System.out.println(sum);
        }
    }
}
