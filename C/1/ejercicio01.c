/* Escibe un programa que imprima los dias de la semana,
    en una funcion los dias habiles y los otros los fines de semana
*/


#include <stdio.h>
#include <stdlib.h>

void DiasAviles();
void DiasFines();

int main(){
    DiasAviles();
    DiasFines();

return 0;
}


void DiasAviles(){
printf("Lunes\n");
 printf("Martes\n");
 printf("Miercoles\n");
 printf("Jueves\n");
 printf("Viernes\n");
}


void DiasFines(){
    printf("Sabado\n");
    printf("Domingo\n");
}
