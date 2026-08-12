//1. reverse an Array.

#include<stdio.h>
#include<stdlib.h>
void swap(int *p,int *q);
int main(){
    int n;
    printf("Enter the Array Size: ");
    scanf("%d",&n);
    int *arr=(int *)malloc(n*sizeof(int));
    if(arr==NULL){printf("Insufficient Space."); return 0;}
    // taking the Array input.
    printf("Enter the Array elements: \n");
    for(int i=0;i<n;i++){
        printf("arr[%d]: ",i);
        scanf("%d",&arr[i]);
    }
    // Printing the taken Array.
    printf("The array: \n");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    // reversing the array.
    for(int i=0;i<n/2;i++){
        swap(&arr[i], &arr[n - i - 1]);
    }
    // Printing the taken Array.
    printf("\nThe array: \n");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}
void swap(int *p, int *q){
    int t=*p;
    *p=*q;
    *q=t;
}