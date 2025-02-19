//Tipos de datos literares(primitivos): int, float, double, char, void
//Modificadores de tipo de datos: signed, unsigned, short, long
//Palabras reservadas: int, float, double, char, void, signed, unsigned, short, long, etc.
//Constantes: const  
//Constantes simbólicas: #define [No ocupa ' ; ' al final]

#include <stdio.h>

#define PI 3.14159267 //Creado en tiempo de preprocesamiento 
#define LUNES 1

void main(){
    const double PI2 = 3.14159267; //Creado en tiempo de ejecución

    int num_1=10;
    printf("El valor del primer número es: %d\n", num_1);
    num_1 = 3.1416;
    printf("El valor del primer número es: %.2f\n", (float)num_1);

    const int num_2=20; //En tiempo de compilación

    num_1=30; //operaciones destructivas
    printf("El valor del primer número es: %d\n", num_1);

    printf("El valor de PI es: %2.6f\n", PI);
    

}