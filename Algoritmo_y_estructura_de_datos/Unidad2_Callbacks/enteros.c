#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

#include "enteros.h"

///ENTEROS

//MostrarEnteros
void mostrarInt(int n){

    printf(" %d ", n);
};

//WrapperEnteros
void wrapperInt(void * dato){

    int n = *(int* ) dato;
    mostrarInt(n);

};

//ComparaInt
int compararInt(void * dato1, void * dato2){
    int n1 = *(int* ) dato1;
    int n2 = *(int* ) dato2;

    return n1>n2;
};


///FLOATS
//MostrarFloat
void mostrarFloat(float n){
    printf(" %.2f ", n);
};

//WrapperFloat
void wrapperFloat(void * dato){

    float n = *(float *) dato;
    mostrarFloat(n);
};

//ComparaFloat
int compararFloat(void * dato1, void * dato2){

    float n1 = *(float* ) dato1;
    float n2 = *(float* ) dato2;

    return n1>n2;

};



