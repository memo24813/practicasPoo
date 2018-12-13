#ifndef _MATRIZ_H
#define _MATRIZ_H
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct{
    int renglon;
    int columna;
}matriz;

typedef struct{
    matriz d;
    int **matriz;
}MatrizInt;

typedef struct{
    matriz d;
    float **matriz;
}MatrizFloat;

int capturaInt(char[]);
int validacionMatrizInt(MatrizInt,MatrizInt);
int validacionMatrizFloat(MatrizFloat,MatrizFloat);
MatrizInt sumaMatrizInt(MatrizInt,MatrizInt);
MatrizInt restaMatrizInt(MatrizInt,MatrizInt);
MatrizFloat sumaMatrizFloat(MatrizFloat,MatrizFloat);
MatrizFloat restaMatrizFloat(MatrizFloat,MatrizFloat);
MatrizInt traspuestaMatrizInt(MatrizInt);
MatrizFloat traspuestaMatrizFloat(MatrizFloat);
void iniciarMatrizInt(MatrizInt);
void iniciarMatrizFloat(MatrizFloat);
void iniciarceroInt(MatrizInt);
void iniciarceroFloat(MatrizFloat);
MatrizInt multiplicarMatrizInt(MatrizInt,MatrizInt);
MatrizFloat multiplicarMatrizFloat(MatrizFloat,MatrizFloat);
void imprimirMatrizInt(MatrizInt);
void imprimirMatrizFloat(MatrizFloat);
int** reservaMInt(int,int);
float** reservaMFloat(int,int);
void mensaje(char[]);
#endif