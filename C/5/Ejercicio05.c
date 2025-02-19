#include <stdio.h>
#include <stdlib.h>

int mult(int a, int b);
void Tabla(int a, int i);
int leer_numero(char *mensaje);

void main(){
    int numero= leer_numero("Introduce un número: ");
    int veces= leer_numero("Introduce las veces a multiplicar: ");
    Tabla(numero, veces);

    printf("ICI Soluciones inteligentes de software agradece su preferencia\n");
}

int leer_numero(char *mensaje){
    int num;
    printf("%s", mensaje);
    scanf("%d", &num);
    return num;
}

//Escriba una función que realice la multiplicación
int mult(int a, int b){//Argumentos posicionales
    return a*b;
}

void Tabla(int a, int b){
    for(int i=1;i<=b;i++){
        printf("%d x %d = %d\n", a, i, mult(a,i));
    }
}