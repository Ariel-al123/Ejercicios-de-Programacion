#include "stdio.h"

// llena una matriz de 3x3

void mostrarmatriz(int matriz[3][3]){
    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
            printf("Elemento [%d][%d]: %d\n", i, j, matriz[i][j]);
        }
        printf("\n");*
    }
}

void main(){
    int matriz[3][3];

    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
            matriz[i][j] = i + j;
        }
    }
    mostrarmatriz(matriz);
}