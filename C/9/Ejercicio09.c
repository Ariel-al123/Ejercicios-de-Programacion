#include "stdio.h"
#include "stdlib.h"

/*
    * Ejercicio 9
    * 
    * Realice un programa que pregunte al usuario el año de naciminto y el año actual  y calcule la edad
    * si es correcta y ademas si es mayor de edad o no
    *
    */
    int leer_entero(char *mensaje);
    int verificar_edad(int año_nacimiento, int año_actual);
    void mayor_edad(int edad, int edad_real);   
    
   void main(){
       int anio_nacimiento = leer_entero("Ingrese el año de nacimiento: ");
       int anio_actual = leer_entero("Ingrese el año actual: ");
       int edad  = leer_entero("Ingrese la edad real: ");

       int edad_real = verificar_edad(anio_nacimiento, anio_actual);
         mayor_edad(edad, edad_real);
    
    }

    int leer_entero(char *mensaje){
    int numero;
    printf("%s", mensaje);
    scanf("%d", &numero);
    return numero;
    }

    int verificar_edad(int año_nacimiento, int año_actual){
    int edad = año_actual - año_nacimiento;
    return edad;
    }

    void mayor_edad(int edad, int edad_real){

        if (edad != edad_real){
            printf("Esa no es tu edad real mentiroso, tienes %d\n", edad_real);
        }
        
        if(edad_real >= 18){
            printf("y eres mayor de edad %d\n", edad_real);
        }else{
            printf("Eres menor de edad");
        }
    }