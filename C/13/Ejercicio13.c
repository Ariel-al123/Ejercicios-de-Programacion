//Contar Consonates
#include <stdio.h>
#include <string.h>

void Conteo_de_Consonantes(char *cadena);

void main(){
    char *cadena = "Hola Mundo";
    Conteo_de_Consonantes(cadena);   
}

void Conteo_de_Consonantes(char *cadena){
    int consonantes = 0;
    int i = 0;
    for (cadena[i] = 0; i < strlen(cadena); i++){
        if(cadena[i] != 'a' & cadena[i] != 'e' && cadena[i] != 'i' && cadena[i] != 'o' && cadena[i] != 'u'){
            consonantes++;
        }
    }
    printf("La palabra %s tiene %d consonantes /n", cadena, consonantes);
}