#include<stdio.h>
#include<stdlib.h>
int main(int argc, char *argv[]){
  int array[argc-1];
  int swap;
  for(int i = 1; i < argc; i++)
    array[i-1] = atoi(argv[i]);
  for(int i = 1; i < argc-1; i++){
    for(int j = i; j > 0; j--){
      if(array[j] < array[j-1]){
        swap = array[j];
        array[j] = array[j-1];
        array[j-1] = swap;
      }
    }
  }
  for(int i = 0; i < argc-1; i++)
    printf("%d ", array[i]);
  printf("\n");
  return 0;
}