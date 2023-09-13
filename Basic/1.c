#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
int main(int argc, char* argv[]){
int sl = symlink(argv[1], argv[2]);
if(sl==0){
printf("Soft link created successfully\n");
}
return 0;
}