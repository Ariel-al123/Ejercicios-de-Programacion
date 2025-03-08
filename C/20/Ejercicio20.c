#include "stdio.h"
#include "stdlib.h"
#include "time.h"

/*
     Promedio de los elementos de un arreglo: Escribe un programa que calcule el promedio de los elementos
     de un arreglo de enteros. Usa una función para obtener el promedio.
*/

float Promedio(int n[], int limite);

void main(){
    srand(time(NULL));
    int n = rand() % 10 + 1;
    int elementos[n];

    for(int i = 0; i < n; i++){
        elementos[i] = rand() % (10 + 1);
        printf("Elemento %d: %d\n", i + 1, elementos[i]);
    }
    float resultado = Promedio(elementos, n);
    printf("El promedio de los elementos es: %2.2f\n", resultado);
}

float Promedio(int n[], int limite){
    int suma = 0;
    for(int i = 0; i < limite; i++){
        suma += n[i];
        printf("Suma: %d\n", suma);
    }
    
    return (float) suma / limite;
}