public class ConsOne {
    public static void main(String[] args){
        int[] arr={1, 0, 1, 1, 1, 0, 1, 1, 1};
        int n=cons(arr);
        System.out.println(n);
    }
    public static int cons(int[] arr){
        int sum=0,max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==1&&arr[i-1]==1){sum=sum+2;}
            else{sum=0;}
            if(sum>max){max=sum-1;}
        }
        return max;
    }
}
