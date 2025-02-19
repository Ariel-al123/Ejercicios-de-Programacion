#include <stdio.h>
#include <stdlib.h>

int main(){

    int a = 5,
        b = 4;

    printf("La suma de %d y %d es: %d \n", a, b, a+b);
    printf("La resta de %d y %d es: %d \n", a, b, a-b);
    printf("La multiplicacion de %d y %d es: %d \n", a, b, a*b);
    printf("La division de %d y %d es: %2.2f \n", a, b, (float) a/b);
    printf("El modulo de de %d y %d es: %d \n", a, b, a%b);

    int contador = 0;
    contador++; //Incrementa en 1
    printf("El valor de contador es: %d \n", contador);
    contador--; //Decrementa en 1

    contador += 5; //Incrementa en 5
    printf("El valor de contador es: %d \n", contador);

    return 0;
}