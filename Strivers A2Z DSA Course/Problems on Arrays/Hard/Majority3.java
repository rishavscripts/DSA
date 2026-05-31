import java.util.*;
public class Majority3 {
    public static void main(String[] args){
        int[] arr={1, 2, 1, 1, 3, 2, 2};
        List<Integer> ans= majority(arr);
        for(int n:ans){System.out.print(n+" ");}
    }
    public static List<Integer> majority(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans= new ArrayList<>();
        int size=arr.length;
        for(int n: arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        for(int n: map.keySet()){
            if(map.get(n)>size/3){ans.add(n);}
        }        
        
        return ans;
    }
}
