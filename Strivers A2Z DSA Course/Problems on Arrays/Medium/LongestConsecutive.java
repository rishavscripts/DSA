import java.util.*;
public class LongestConsecutive {
    public static void main(String[] args){
        int[] arr={0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int ans=longest(arr);
        System.out.println(ans);
    }
    public static int longest(int[] arr){
        Set<Integer> s=new HashSet<>();
        for(int n:arr){s.add(n);}
        List<Integer> list = new ArrayList<>();
        for(int n:s){list.add(n);}
        list.sort(null);
        int max=1;
        int sum=1;
        //System.out.println(list);
        for(int i = 0; i < list.size() - 1; i++){
        if(list.get(i) + 1 == list.get(i+1)){
            sum++;
        }
        else{
            max = Math.max(max, sum);
            sum = 1; 
        }
    }
    max = Math.max(max, sum);  

        return max;
    }
}
