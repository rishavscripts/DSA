
import java.util.*;
public class RearrangeBySign {
    public static void main(String[] args){
        int[] arr={1, -1, -3, -4, 2, 3};
        int[] ans = rearrange(arr);
        for(int n:ans){System.out.print(n+" ");}
    }    
    public static int[] rearrange(int[] arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int n: arr){
            if(n<0){neg.add(n);}
            else{pos.add(n);}
        }
        int[] ans = new int[arr.length];
        if(arr[0]>=0){
            for(int i=0;i<ans.length;i=i+2){ans[i]=pos.getFirst(); pos.removeFirst();}
            for(int i=1;i<ans.length;i=i+2){ans[i]=neg.getFirst(); neg.removeFirst();}
        }
        else{
            for(int i=0;i<ans.length;i=i+2){ans[i]=neg.getFirst(); neg.removeFirst();}
            for(int i=1;i<ans.length;i=i+2){ans[i]=pos.getFirst(); pos.removeFirst();}
        }
        return ans;
    }
}
