import java.util.*;
public class LeadersArray {
    public static void main(String[] args){
        int[] arr= {-3, 4, 5, 1, -4, -5};
        List<Integer> ans=new ArrayList<>();
        ans=leader(arr);
        for(Integer n: ans){System.out.print(n+" ");}
    }
    public static List<Integer> leader(int[] arr){
        
        int size=arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[size-1]);
        for(int i=size-1;i>=1;i--){
            if(arr[i]<arr[i-1]){ans.add(arr[i-1]);}
        }        
        return ans.reversed();
    }
}
