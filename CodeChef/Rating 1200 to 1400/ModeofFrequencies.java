import java.util.*;
public class ModeofFrequencies {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i:arr){map.put(i,map.getOrDefault(i,0)+1);}
            int maxFreq=0,val=-1;
            for(int key:map.keySet()){
                if(map.get(key)>maxFreq) {maxFreq=map.get(key); val=key;}
                if(map.get(key)==maxFreq && val>key){val=key;}
            }
            System.out.println(val);
        }
    }
}
