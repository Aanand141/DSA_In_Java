#include<stdio.h>
int main(){
    int i,n,j,temp;
    printf("enter the seize of the array:");
    scanf("%d",&n);
    int array[n];
    printf("Enter the value of the array:");
    for(i = 0;i < n;i++){
        scanf("%d",&array[i]);
    }
    for(i=n;i>0;i--){
        for(j=0;j<i-1;j++){
            if(array[j]>array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    printf("Shorted result is :\n");
    for(i=0;i<n;i++){
        printf("%d ",array[i]);
    }
}