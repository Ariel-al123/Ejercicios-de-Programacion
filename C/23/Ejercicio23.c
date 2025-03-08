#include <stdio.h>

void matriz2(int *matriz[5][5], int n);

int main(){
    int matriz[5][5];

    matriz2(*matriz, 5);
    
    return 0;
}
void matriz2(int matriz[][], int n){
    int a = 0, k = 5;
    for (int i = 0; i < n; i++){
        a = i + 1;
        for (int j = 0; j < n; j++){
            matriz[j][i] = a * k;
            printf("Elemento [%d][%d]: %d\n", j, i, matriz[j][i]);
        }
        printf("\n");
    }

}