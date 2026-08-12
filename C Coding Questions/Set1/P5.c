// rotate array by K positions

#include<stdio.h>
#include<stdlib.h>

void rotate( int* arr, int n, int k){
    for(int i=0;i<k;i++){
        // single rotate code.
        int t=arr[0];
        for(int j=1;j<n;j++){
            arr[j-1]=arr[j];
        }
        arr[n-1]=t;
    }
}
int main(){
    int n;
    printf("Enter the Array size: ");
    scanf("%d",&n);
    int *arr=(int *)malloc(n*sizeof(int));
    if(arr==NULL){printf("Insufficient space"); return 0;}
    int k;
    printf("Enter the k value (rotate number): ");
    scanf("%d",&k);

    //User input
    printf("Enter the array element: \n");
    for(int i=0;i<n;i++){
        printf("arr[%d]: ",i);
        scanf("%d",&arr[i]);
    }
    // printing the array:
    printf("The Array: \n");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }

    // Operation on fucntion call;
    rotate(arr,n,k);

    // printing the array:
    printf("\nThe Array: \n");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}