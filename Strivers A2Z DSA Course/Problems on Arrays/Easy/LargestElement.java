
public class LargestElement {
    public static void main(String[] args){
        int[] arr={-4, -3, 0, 1, -8};
        int largest=large(arr);
        System.out.println(largest);
    }
    public static int large(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){max=arr[i];}
        }
        return max;
    }
}
