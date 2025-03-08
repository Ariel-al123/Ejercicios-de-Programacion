#include "stdio.h"
#include "string.h"

void Conteo_de_Palabras(char *cadena);

void main(){
    char *cadena = "fake eyes open";
    Conteo_de_Palabras(cadena);
}

void Conteo_de_Palabras(char *cadena){
    int palabras = 1;
    for(int i = 0; i < strlen(cadena); i++){
        if(cadena[i] == ' '){
            palabras++;
        }
    }

    printf("La palabra %s tiene %d palabras /n", cadena, palabras);
}