#include "stdio.h"
#include "string.h"

/*
    1. Suma de los cuadrados de los primeros n números:
    Escribe un programa que calcule la suma de los cuadrados
    de los primeros n números naturales.
    Usa una función para obtener la suma.
*/

int LeerEntero(char *mensaje);
int SumaCuadrados(int n);

void main(){
    int NumerosEnteros = LeerEntero("Ingrese la cantidad de numeros enteros: ");
    int Resultado = SumaCuadrados(NumerosEnteros);
    printf("---------------------------\n");
    printf("%d \n", Resultado);
}

int LeerEntero(char *mensaje){
    int n;
    printf("%s", mensaje);
    scanf("%d", &n);
    return n;
}


int SumaCuadrados(int n){
    int suma = 0;
    int cuadrado = 0;
    for (int i = 1; i <= n; i++){
        cuadrado = i * i;
        suma += cuadrado;
        printf("%d^2 = %d\n",i, cuadrado);
    }
    return suma;
}