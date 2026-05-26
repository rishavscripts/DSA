public class MissingNumber {
    public static void main(String[] args){
        int[] arr={0, 1, 2, 4, 5, 6};
        int num=miss(arr);
        System.out.println(num);
    }
    public static int miss(int[] arr){
        int size=arr.length;
        int sum=(size*(size+1))/2;
        for(int n:arr){sum-=n;}   
        return sum;
    }
}
