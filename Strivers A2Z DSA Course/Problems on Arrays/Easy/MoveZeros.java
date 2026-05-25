
public class MoveZeros {
    public static void main(String[] args){
        int[] arr1={0, 1, 4, 0, 5, 2};
        int[] arr2={0, 0, 0, 1, 3, -2};
        move(arr1);
        move(arr2);
        for(int n:arr1){System.out.print(n+" ");}
        System.out.println();
        for(int n:arr2){System.out.print(n+" ");}
    }    
    public static void move(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                for(int k=i+1;k<=j;k++){
                    arr[k-1]=arr[k];
                }
                arr[j]=0;
                j--;
            }
            else{i++;}
        }

    }
}
