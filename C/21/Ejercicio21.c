#include "stdio.h"

void main(){
    char *mensaje[] = {"holaa", "mundo"}; 
    
    for (int i = 0; i < 5; i++){
        for (int j = 0; j < 5; j++){
            printf("%s\n", mensaje[0][i]);
        }
        printf("\n");        
    }
    printf("\n");
}