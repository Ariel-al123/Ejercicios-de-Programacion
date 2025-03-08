#include "stdio.h"
#include "stdlib.h"
#include "time.h"

/*
    Producto de los elementos de un arreglo por un escalar,
    usa una función para obtener el producto.
*/

void Escala(int n[], int multiplicador, int limite);

void main(){
    int multiplicador = 0;
    srand(time(NULL));
    // Cantidad al azar del array
    int n = rand() % 10 + 1;
    int elementos[n];
    int a = 0;
    
    printf("Ingrese la cantidad a multiplicar de los elementos: ");
    scanf("%d", &multiplicador);

    printf("Elementos del elementos: %d\n", n);
    
    //Elementos del array al azar
    for(int i = 0; i < n; i++){
        //Inicializa los elementos para después asignarles un valor
        elementos[i] = rand() % (10 + 1);
        a = i + 1;
        //Si el elemento es 0, se le asigna 1
        if (elementos[i] == 0)
            elementos[i] = 1;
        
        printf("Elemento %d: %d\n", a, elementos[i]);
    }
    printf("---------------------------\n");
    Escala(elementos, multiplicador, n);
}

void Escala(int n[], int multiplicador, int limite){
    int producto = 0;
    for(int i = 0; i < limite; i++){
        producto = n[i] * multiplicador;
        printf("%d x %d = %d\n", n[i], multiplicador, producto);
    }
}