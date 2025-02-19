#include "stdio.h"
#include "stdlib.h"

void main(){
   int a, b;
    a = 10;
    b = 3;
    printf("a > b: %d\n", a > b);
    printf("a < b: %d\n", a < b);
    printf("a >= b: %d\n", a >= b);
    printf("a <= b: %d\n", a <= b);
    printf("a == b: %d\n", a == b);
    printf("a != b: %d\n", a != b);
    printf("a && b: %d\n", a && b);
    printf("a || b: %d\n", a || b);
    printf("!a: %d\n", !a);
    printf("!b: %d\n", !b);

    if (a>b){
        printf("a es mayor que b\n");
    } else {
        printf("a no es mayor que b\n");
    }

    int calificacion = 11;

    if (calificacion >= 0 && calificacion <= 10){
        printf("La calificacion es valida\n");
    } else {
        printf("La calificacion invalida\n");
    }

}