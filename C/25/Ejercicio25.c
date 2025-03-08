#include "stdio.h"
#include "stdlib.h"
#include "time.h"

float GenerarCalificacion();

void AsignarCalificaciones(
    int N,
    int M,
    int calificacion[N][M],
    char *Nombres[],
    char *Materia[]
);

void MostrarMaterias(
    int N,
    char *Materia[]
);

void PromedioPorMateria(
    int N,
    int M,
    int calificacion[N][M],
    char *Materia[],
    char *Nombres[]
);

void PromedioPorEstudiante(
    int N,
    int M,
    int calificacion[N][M],
    char *Materia[],
    char *Nombres[]
);

void MejorPromedio(
    int M,
    int Promedio[]
);

void MateriaMejorDesempeño(
    int M,
    int Promedio[]
);

float PromedioDelGrupo(
    int N,
    int M,
    int calificacion[N][M]

);

void MateriaConProblemas(
    int M,
    int MateriaPromedio[],
    int N,
    char *Nombres[],
    char *Materia[],
    float PromedioGeneral
);


void EstudiantesConProblemas(
    int M,
    int N,
    int calificacion[N][M],
    char *Nombres[],
    char *Materia[]
);
  

int main() {
    int N = 10;
    int M = 5;
    srand(time(NULL));

    int calificacion[N][M];

    char *Materia[] = {
        "Español",
        "Matematicas",
        "Quimica",
        "Historia",
        "Fisica"
    };

    char *Nombres[] = {
        "Juan",
        "Pedro",
        "Maria",
        "Jose",
        "Luis",
        "Ana",
        "Rosa",
        "Carlos",
        "Jorge",
        "Miguel"
    };

    // Mostrar Materias
    MostrarMaterias(M, Materia);

    // Asignación de Calificaciones Aleatorias
   AsignarCalificaciones(N, M, calificacion, Nombres, Materia);

    return 0;
}

float GenerarCalificacion() {
    return 5.0 + (rand() % 51) / 10.0;
}

void AsignarCalificaciones(int N, int M, int calificacion[N][M], char *Nombres[], char *Materia[]) {
    // Asignación de Calificaciones Aleatorias
    printf("Calificaciones aleatorias:\n");

    int a = 1;
    for (int i = 0; i < N; i++) {
        printf("%d -. %s", a, Nombres[i]);  
        for (int j = 0; j < M; j++) {
            // Asignación de calificaciones
            calificacion[i][j] = GenerarCalificacion();
            printf(" [%d][%d] = %2.f", i, j, (float)calificacion[i][j]);
        }
        a++;
        printf("\n");
    }
    printf("---------------------------------------------------------------------------\n");

    PromedioPorMateria(N, M, calificacion, Materia, Nombres);
}

void MostrarMaterias(int N, char *Materia[]) {
    for (int i = 0; i < N; i++) {
        printf("%s ", Materia[i]);
    }
    printf("\n");
}

void PromedioPorMateria(int N, int M, int calificacion[N][M], char *Materia[], char *Nombres[]) {

    printf("Promedio por Materia: \n");
    MostrarMaterias(M, Materia);
    int promedio[N]; 
    float suma = 0;
    for (int i = 0; i < M; i++) { 
        for (int j = 0; j < N; j++) {  
            suma += calificacion[j][i];  
        }
        promedio[i] = suma / N;
        printf("   %d   ", promedio[i]);
        suma = 0;
    }
    printf("\n");

    PromedioPorEstudiante(N, M, calificacion, Materia, Nombres);
    MateriaMejorDesempeño(M, promedio);
    float PromedioGeneral =  PromedioDelGrupo(N, M, calificacion);
    MateriaConProblemas(M, promedio, N, Nombres, Materia, PromedioGeneral);
    EstudiantesConProblemas(M, N, calificacion, Nombres, Materia);
}

void PromedioPorEstudiante(int N, int M, int calificacion[N][M], char *Materia[], char *Nombres[]){
    printf("Promedio Por Estudiantes:\n");

    int a = 1, suma = 0;
    float promedio = 0;
    int PromedioTotal[N];
    for (int i = 0; i < N; i++) {

        promedio = 0;
        suma = 0;
        printf("%d -. %s", a, Nombres[i]);

        for (int j = 0; j < M; j++) {
            suma += calificacion[i][j];
        }

        promedio = suma / M;
        PromedioTotal[i] = promedio;
        a++;
        
        printf(" %2.2f",promedio);
        printf("\n");
    }

     MejorPromedio(M, PromedioTotal);
     
}

void MejorPromedio(int M, int Promedio[]){
    float Mayor = Promedio[0];
    for (int i = 0; i < M; i++){
        if (Mayor < Promedio[i]){
            Mayor = Promedio[i];
        }
    }
    printf("Estudiante con Mayor Promedio:\n");
    printf("%2.2f \n", Mayor);
}

void MateriaMejorDesempeño(int M, int MateriaPromedio[]){
    float MayorPromedio = MateriaPromedio[0];
    for (int i = 1; i < M; i++){
        if (MayorPromedio < MateriaPromedio[i]){
            MayorPromedio = MateriaPromedio[i];
        }
    }
    printf("Materia con Mejor Promedio:\n");
    printf("%2.2f \n", MayorPromedio);
}

float PromedioDelGrupo(int N, int M, int calificacion[N][M]){
    int limite = N * M;
    int suma = 0;
    float Promedio = 0;

    for (int i = 0; i < N; i++){
        for (int j = 0; j < M; j++){
            suma += calificacion[i][j];
        }
        
    }
    Promedio = suma / limite;
    return Promedio;
}



void MateriaConProblemas(int M, int MateriaPromedio[], int N, char *Nombres[], char *Materia[], float PromedioGeneral){
    PromedioGeneral = MateriaPromedio[0];
    printf("Materia con Problemas:\n");
    
    for (int i = 1; i < M; i++){
        if (PromedioGeneral > MateriaPromedio[i]){
            printf(" %s ", Materia[i]);
            printf("%2.2f", PromedioGeneral);
        }
    }
   printf("\n");
   
}


void EstudiantesConProblemas(int M, int N, int calificacion[N][M], char *Nombres[], char *Materia[]){
    float suma = 0, Promedio = 0;
    printf("Estudiantes con Problemas:\n");
    
    for (int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
            if (calificacion[i][j] <= 6){
                printf(" %s reprobó %s con %d \n",Nombres[i], Materia[j], calificacion[i][j]);
            }
        }
    }
}