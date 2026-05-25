import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args){
        int[] arr={0, 0, 3, 3, 5, 6};
        int[] ans=remove(arr);
        for(int i=0;i<ans.length;i++){System.out.print(ans[i]+" ");}
    }
    public static int[] remove(int[] arr){
        Set<Integer> set= new HashSet<>();
        for(int n:arr){
            set.add(n);
        }
        int size=set.size(),i=0;
        int[] ans=new int[size];
        for(Integer n: set){
            ans[i++]=n;
        }
        return ans;
    }
}
