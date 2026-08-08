#include <stdio.h>
#include <stdlib.h>

#include "nodo.h"
#include "pila.h"

struct Pila{
    NodoPtr tope;
};

PilaPtr iniciarPila(){

    PilaPtr pila = (PilaPtr) malloc(sizeof (struct Pila));

    pila->tope = NULL;

    return pila;
};

void apilar(PilaPtr pila, DatoPtr dato){

    NodoPtr nuevoNodo = crearNodo(dato, pila->tope);

    pila->tope = nuevoNodo;
};

DatoPtr desapilar(PilaPtr pila){
    if(!pila->tope){return NULL;}
    else{
        NodoPtr temp = pila->tope;
        DatoPtr dato = getDato(temp);
        pila->tope = getNodoSiguiente(temp);
        free(temp);
        return dato;
    }
};

DatoPtr verTope(PilaPtr pila){
    if(!pila->tope){return NULL;}
    else{ return getDato(pila->tope);}

};

void mostrarPila(PilaPtr pila, void (*mostrar) (void*)){
    NodoPtr actual = pila->tope;
    while(actual != NULL){
        mostrar(getDato(actual));
        actual = getNodoSiguiente(actual);
    }
};


