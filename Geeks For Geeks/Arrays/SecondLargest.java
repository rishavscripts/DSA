
public class SecondLargest {
    public static void main(String[] args){
        int[] arr={12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
    public static int getSecondLargest(int[] arr){
        int max=Math.max(arr[0],arr[1]);
        int secondMax=Math.min(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max){secondMax=max; max=arr[i];}
            else if(arr[i]>secondMax && arr[i]!=max) {secondMax=arr[i];}
        }
        return secondMax;
    }
}
