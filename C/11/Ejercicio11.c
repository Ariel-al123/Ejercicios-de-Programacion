#include "stdio.h"

//indique cuantas vocales tiene la cadena

void Conteo_de_Vocales(char *cadena);

void main(){
    char *cadena = "Hola Mundo";
    Conteo_de_Vocales(cadena);
}

void Conteo_de_Vocales(char *cadena){
    int vocales = 0;
    for(int i = 0; i < 10; i++){
        switch (cadena[i]){
        case 'a':
            vocales++;
            break;
        case 'e':
            vocales++;
            break;
        case 'i':
            vocales++;
            break;
        case 'o':
            vocales++;
            break;
        case 'u':
            vocales++;
            break;
        }

        
    }

    printf("La palabra %s tiene %d vocales /n", cadena, vocales);
}




