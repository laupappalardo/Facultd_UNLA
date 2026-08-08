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

