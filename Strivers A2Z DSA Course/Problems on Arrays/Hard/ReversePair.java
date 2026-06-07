public class ReversePair {
    public static void main(String[] args){
        int[] arr={6, 4, 4, 2, 2};
        System.out.println(find(arr));
    }
    public static int find(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>2*arr[j]) count++;
            }
        }
        return count;
    }
}
