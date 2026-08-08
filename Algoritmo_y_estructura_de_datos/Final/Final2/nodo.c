#include <stdio.h>
#include <stdlib.h>

#include "nodo.h"

struct Nodo{
    DatoPtr dato;
    struct Nodo * siguiente;
};

NodoPtr crearNodo(DatoPtr dato, NodoPtr siguiente){

    NodoPtr nodo = (NodoPtr) malloc(sizeof (struct Nodo));

    nodo->dato = dato;
    nodo->siguiente = siguiente;

    return nodo;
};

//Getter
DatoPtr getDato(NodoPtr nodo){
    return nodo->dato;
};

NodoPtr getNodoSiguiente(NodoPtr nodo){
    return nodo->siguiente;
};

//Setters
void setNodo(NodoPtr nodo, DatoPtr dato){
    nodo->dato = dato;
};

void setNodoSiguiente(NodoPtr nodo, NodoPtr nuevoSiguiente){
    nodo->siguiente = nuevoSiguiente;
};



