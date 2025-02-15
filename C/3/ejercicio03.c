#include "stdio.h"

/*
    Crea un programa que imprima la tabla de multiplicar del 1 al 10
*/

void Tabla();

int main(){
    Tabla();

    return 0;
}

void Tabla(){
    int tabla = 1, pro = 0;
  
    short int i = 0;
    for(tabla=1; tabla<=10;tabla++){
        printf("Tabla del %hd \n", tabla);
        for (i=0; i<=10;i++){
            printf("%d x %hd = %d \n", tabla, i ,pro = i*tabla);
            
        }
        
    }
}