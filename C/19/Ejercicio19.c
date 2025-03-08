#include "stdio.h"
#include "stdlib.h"

/*
     Suma de los dígitos de un número: Escribe un programa que calcule la suma
     de los dígitos de un número entero. Usa una función para obtener la suma.
*/

int SumaDigitos(int a);

void main(){
    int Numero;
    printf("Ingrese un numero entero: ");
    scanf("%d", &Numero);
    
    int suma = SumaDigitos(Numero);
    printf("La suma de los dígitos de %d es %d\n", Numero, suma);
}

int SumaDigitos(int a){
    int suma = 0;
    while (a != 0) {
        suma += a % 10;  // Obtiene el último dígito y lo suma
        a /= 10;         // Elimina el último dígito
    }
    return suma;
}