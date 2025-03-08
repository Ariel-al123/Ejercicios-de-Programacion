#include "stdio.h"
#include "string.h"

void suma(int veces,int tabla);

void main(){
    // Almacena en un array la tabla de multiplicar de un numero n
    // Escribe un programa que retorne la suma total de los resltados de la tabla, usan una funcion para la suma
    
    int tabla = 0 , resultado = 0 , veces = 0;

    printf("Ingrese las cantidad de la tabla (? x 10): ");
    scanf("%d", &veces);
    printf("Ingrese la tabla del numero (1 x ?): ");
    scanf("%d", &tabla);

    suma(veces,tabla);
    
}

void suma(int veces, int tabla){
    int tabla_multiplicar[tabla], suma = 0;

    for (int i = 0; i < veces; i++){
        tabla_multiplicar[i] = tabla * (i + 1);
        suma += tabla_multiplicar[i];
    }

    for (int i = 0; i < veces; i++)
    {
        printf("%d x %d = %d\n", i + 1, tabla, tabla_multiplicar[i]);
    }  

    printf("La suma de los resultados de la tabla es: %d\n", suma);
}