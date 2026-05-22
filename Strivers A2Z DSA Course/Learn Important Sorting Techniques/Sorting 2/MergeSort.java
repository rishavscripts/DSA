public class MergeSort {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        int size=arr.length;
        int[] ans=new int[size];
        ans=mergeSort(arr,0,size-1);
        for(int i=0;i<size;i++){System.out.print(ans[i]+" ");}
    }
    public static int[] mergeSort(int[] arr,int low,int high){
        if (low >= high) {return arr;}
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
        return arr;
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp= new int[high-low+1];
        int i=low, j=mid+1, k=0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k]=arr[i]; k++; i++;
            }
            else{
                temp[k]=arr[j];k++;j++;
            }
        }
        while(i<=mid){temp[k]=arr[i];i++;k++;}
        while(j<=high){temp[k]=arr[j];j++;k++;}

        for(int x=0;x<temp.length;x++){
            arr[low+x]=temp[x];
        }
    }
}
