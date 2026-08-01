import java.util.*;
public class DrumpfForPresident {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(qualified(arr,n,k));
        }
    }
    public static int qualified(int[] arr, int n, int k){
        Map<Integer,Integer> votes = new HashMap<>();
        Set<Integer> disqualified = new HashSet<>();

        // count votes and mark self-voters
        for(int i = 0; i < n; i++){
            votes.put(arr[i], votes.getOrDefault(arr[i], 0) + 1);
            if(arr[i] == i+1){ // self-vote check (students numbered 1..N)
                disqualified.add(i+1);
            }
        }

        int count = 0;
        for(int candidate : votes.keySet()){
            if(votes.get(candidate) >= k && !disqualified.contains(candidate)){
                count++;
            }
        }
        return count;
    }
}
