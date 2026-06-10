public class RoatateArray {
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5};
        int d=2;
        rotate(arr,d);
        for(int i: arr){System.out.print(i+" ");}
    }
    public static void rotate(int[] arr, int d){
        
        for(int j=0;j<d;j++){
            int a=arr[0];
            for(int i=0;i<arr.length-1;i++){arr[i]=arr[i+1];}
            arr[arr.length-1]=a;
        }
    }
}
