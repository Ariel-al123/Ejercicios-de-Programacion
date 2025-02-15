#include "stdio.h"
#include "stdlib.h"

/*
    Escribe un programa que dada el año de nacimiento y el actual año,
    de la edad.
    Imprime la edad
    Escrube otra que la retorne
    use ambas

*/

void Calcular(int nacimiento, int actual);
void Imprimir(int valor);

int main(){
    int nacimiento = 0, actual = 0;
    printf("Dame el tu año de nacimiento \n");
    scanf("%d", &nacimiento);

    printf("Dame el año actual \n");
    scanf("%d", &actual);

    Calcular(nacimiento, actual);

    return 0;
}
void Calcular(int nacimiento, int actual){
    int valor = actual - nacimiento;
    Imprimir(valor);
}

void Imprimir(int valor){
    printf("Tienes %d años\n", valor);
}
