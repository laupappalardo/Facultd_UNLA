#include <stdio.h>
#include <stdlib.h>

#include "nodo.h"

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

//Getters
DatoPtr getDato(NodoPtr nodo){
    return nodo->dato;
};

NodoPtr getNodoSiguiente(NodoPtr nodo){
    return nodo->siguiente;
};

//Setters
void setDato(NodoPtr nodo, DatoPtr dato){
    nodo->dato = dato;
};

void setNodo(NodoPtr nodo, NodoPtr nuevoSiguiente){
    nodo->siguiente = nuevoSiguiente;
};
