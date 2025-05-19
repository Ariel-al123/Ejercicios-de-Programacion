#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

// Función para verificar si un dígito ya existe en el código
int digito_repetido(const char *codigo, char digito, int hasta) {
    for (int i = 0; i < hasta; i++) {
        if (codigo[i] == digito) {
            return 1;
        }
    }
    return 0;
}

// Función para generar un código único
void generar_codigo(char *codigo) {
    // Parte fija
    strcpy(codigo, "SP1DEE-");
    int pos = 7; // Posición actual en el código
    
    // Generar los 24 dígitos (6x4)
    for (int segmento = 0; segmento < 4; segmento++) {
        for (int i = 0; i < 6; i++) {
            char digito;
            do {
                digito = '0' + rand() % 10; // Dígito aleatorio 0-9
            } while (digito_repetido(codigo, digito, pos));
            
            codigo[pos++] = digito;
        }
        
        // Agregar guión (excepto después del último segmento)
        if (segmento < 3) {
            codigo[pos++] = '-';
        }
    }
    
    codigo[pos] = '\0'; // Terminar la cadena
}

int main() {
    srand(time(NULL)); // Semilla para números aleatorios
    
    int cantidad;
    printf("¿Cuántos códigos deseas generar? ");
    scanf("%d", &cantidad);
    
    printf("\nCódigos generados:\n");
    for (int i = 0; i < cantidad; i++) {
        char codigo[30]; // Suficiente espacio para el código
        generar_codigo(codigo);
        printf("%s\n", codigo);
    }
    
    return 0;
}