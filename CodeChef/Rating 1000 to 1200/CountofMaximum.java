import java.util.*;
public class CountofMaximum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CountofMaximum obj = new CountofMaximum();
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] result = obj.mostFrequent(N, A);
        System.out.println(result[0] + " " + result[1]);
    }
    public int[] mostFrequent(int N, int[] A) {
        //write your code  here 
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:A){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int val=-1,freq=-1;
        for(int key:map.keySet()){
            if(freq<map.get(key)){freq=map.get(key); val=key;}
            else if(freq==map.get(key)){if(val>key){val=key;}}
        }
        ans[0]=val; ans[1]=freq;
        return ans;
    }
}
