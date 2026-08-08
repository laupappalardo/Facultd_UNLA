#include <stdio.h>
#include <stdlib.h>

#include "nodo.h"
#include "lista.h"

struct Nodo {
    DatoPtr dato;
    struct Nodo * siguiente;

};

NodoPtr crearNodo(DatoPtr dato, NodoPtr siguiente){

    NodoPtr nodo = (NodoPtr) malloc(sizeof(struct Nodo));

    nodo->dato = dato;
    nodo->siguiente = siguiente;

    return nodo;
};

void mostrarNodoInt(NodoPtr nodo){

    printf(" %d -", *(int *) (nodo->dato));

};

void mostrarNodoFloat(NodoPtr nodo){

    printf(" %.2f -", *(float *) (nodo->dato));

};

void mostrarNodoChar(NodoPtr nodo){

    printf(" %s -", (char *) (nodo->dato));

};

void liberarNodo(NodoPtr nodo){

    free(nodo);
};

DatoPtr getDato(NodoPtr nodo){
    return nodo->dato;
};

NodoPtr getNodoSiguiente(NodoPtr nodo){
    return nodo->siguiente;
};

void setDato(NodoPtr nodo, DatoPtr dato){

    nodo->dato = dato;
};

void setNodo(NodoPtr nodo, NodoPtr nuevoNodo){

    nodo->siguiente = nuevoNodo ;

};

