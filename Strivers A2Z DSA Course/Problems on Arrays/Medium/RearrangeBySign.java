// error in this code
public class RearrangeBySign {
    public static void main(String[] args){
        int[] arr={2, 4, 5, -1, -3, -4};
        int[] ans = rearrange(arr);
        for(int n:ans){System.out.print(n+" ");}
    }    
    public static int[] rearrange(int[] arr){
        //int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            else{
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
               
        return arr;
    }
}
