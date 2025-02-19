//Estructuras repetitivas
//1.- Inicio
//2.- Condición de termino (Expresión lógica)   
//3.- Incremento o decremento
//4.- cuerpo del ciclo

//1.- for
//2.- while
//3.- do while


#include<stdio.h>

void mi_for();
void mi_while();
void mi_do_while();

int main(){
    mi_for();
    mi_while();
    mi_do_while();
    return 0;
}

void mi_for(){
    printf("Estructura repetitiva for\n");
    for (int i = 0; i < 10; i++){
        printf("i: %d\n", i);
    }
}

void mi_while(){
    printf("Estructura repetitiva while\n");
    int i = 0;
    while(i < 10){
        printf("i: %d\n", i);
        i++;
    }
}

void mi_do_while(){
    printf("Estructura repetitiva do while\n");
    int i = 0;
    do{
        printf("i: %d\n", i);
        i++;
    }while(i < 10);
}