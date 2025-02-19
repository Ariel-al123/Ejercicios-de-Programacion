#include <stdio.h>

/*
    Crea una calculadora con las operaciones basicas
*/

int Suma(int a, int b);
int Resta(int a, int b);
int Multiplicacion(int a, int b);
float Division(float a, float b);

int main()
{

     int opcion = 0;

    printf("1.Suma\n");
    printf("2.Resta\n");
    printf("3.Multiplicacion\n");
    printf("4.Division\n");
    printf("------------------------\n");
    scanf("%d", &opcion);

    int num1 = 0, num2 = 0;
    printf("Dame el primer valor\n");
    scanf("%d", &num1);

    printf("Dame el segundo valor\n");
    scanf("%d", &num2);

    switch (opcion)
    {
    case 1:
    printf("%d \n",
        Suma(num1, num2));
        break;
    case 2:
    printf("%d \n",
        Resta(num1, num2));
        break;
    case 3:
    printf("%d \n",
        Multiplicacion(num1, num2));
        break;
    case 4:
    printf("%f \n",
        Division(num1, num2));
        break;

    default:
    printf("Escoge bien \n");
        break;
    }

    return 0;
}

int Suma(int a, int b)
{
    return a + b;
}

int Resta(int a, int b)
{
    return a - b;
}

int Multiplicacion(int a, int b)
{
    return a * b;
}

float Division(float a, float b)
{
    return a / b;
}