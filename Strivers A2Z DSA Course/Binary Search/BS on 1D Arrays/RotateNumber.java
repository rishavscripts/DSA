import java.util.*;

public class RotateNumber {
    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));
       int ans = findRotation(arr);
       System.out.println(ans);
    }
    public static int findRotation(ArrayList<Integer> arr){
        int count=0,ans=0;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<arr.get(i-1)){break;}
            if(arr.get(i)>arr.get(i-1)){count++;}
        }
        ans=count+1;
        return ans;
    }
}
