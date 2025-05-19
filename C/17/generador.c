#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

#define PREFIX "SP1DEE"
#define GROUPS 4
#define GROUP_LENGTH 6
#define TOTAL_LENGTH (GROUPS * GROUP_LENGTH)

void shuffle(char *array, size_t n) {
    if (n > 1) {
        for (size_t i = n - 1; i > 0; i--) {
            size_t j = rand() % (i + 1);
            char tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }
}

void generate_code(char *output) {
    const char charset[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    const int charset_len = sizeof(charset) - 1; // sin contar el '\0'
    
    if (TOTAL_LENGTH > charset_len) {
        fprintf(stderr, "Error: No hay suficientes caracteres únicos disponibles.\n");
        exit(EXIT_FAILURE);
    }

    char pool[charset_len + 1];
    strcpy(pool, charset);
    shuffle(pool, charset_len);

    sprintf(output, "%s-", PREFIX);

    int pos = strlen(output);
    for (int i = 0; i < GROUPS; i++) {
        for (int j = 0; j < GROUP_LENGTH; j++) {
            output[pos++] = pool[i * GROUP_LENGTH + j];
        }
        if (i < GROUPS - 1)
            output[pos++] = '-';
    }
    output[pos] = '\0';
}

int main() {
    srand((unsigned int)time(NULL));

    char code[64];
    generate_code(code);

    printf("Código generado: %s\n", code);

    return 0;
}
