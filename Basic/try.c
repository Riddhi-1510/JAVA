#include<stdio.h>
int main(){
    int a[10] = {9,8,7,6,5,4,3,2,1,0};
    int *p = &a[5];
    printf("%d",p[a[0]]);

}