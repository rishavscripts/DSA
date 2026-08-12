// Find the largest and Smallest number.
#include<stdio.h>
#include<stdlib.h>
int find_largest(const int *arr, int size) {
    int large = arr[0];

    for (int i = 1; i < size; i++) {
        if (arr[i] > large) {
            large = arr[i];
        }
    }

    return large;
}

int find_smallest(const int *arr, int size) {
    int small = arr[0];

    for (int i = 1; i < size; i++) {
        if (arr[i] < small) {
            small = arr[i];
        }
    }

    return small;
}
int main(){
    printf("Enter the size of array: ");
    int n;
    scanf("%d",&n);
    int *arr=(int *)malloc(n*sizeof(int));
    // Array initialization check.
    if(arr==NULL){printf("Insufficient Space."); return 0;}

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
    int smallest_value = find_smallest(arr, n);
    int largest_value = find_largest(arr, n);
    printf("the largest array element is : %d",largest_value);
    printf("the smallest array element is : %d",smallest_value);
    return 0;
}
