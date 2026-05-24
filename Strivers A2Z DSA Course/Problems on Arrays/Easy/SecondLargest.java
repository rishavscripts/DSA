
public class SecondLargest {
    public static void main(String[] args){
        int[] arr={-4, -3, 0, 1, -8};
        int secondLargest=large_2(arr);
        System.out.println(secondLargest);
    }
    public static int large_2(int[] arr){
        int p1=(arr[0]>arr[1])?arr[0]:arr[1];
        int p2=(arr[0]>arr[1])?arr[1]:arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]>p1){
                p2=p1; p1=arr[i];
            }
            else if(arr[i]>p2 && arr[i]!=p1){
                p2=arr[i];
            }
        }
        return p2;
        
    }
}
