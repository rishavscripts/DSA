import java.util.*;
public class Sort123 {
    public static void main(String[] args){
        int[] arr={0, 0, 1, 1, 1};
        sort(arr);
    }
    public static void sort(int[] arr){
        //int size=arr.length;
       // int[] ans=new int[size];
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> a= new ArrayList<>();
        
        if(map.containsKey(0)){
            int size_0=map.get(0);
            for(int i=0;i<size_0;i++){a.add(0);}
        }
        if(map.containsKey(1)){
            int size_1=map.get(1);
            for(int i=0;i<size_1;i++){a.add(1);}
        }
        if(map.containsKey(2)){
            int size_2=map.get(2);
            for(int i=0;i<size_2;i++){a.add(2);}
        }
        for(Integer n: a){System.out.print(n+" ");}
    }
}
