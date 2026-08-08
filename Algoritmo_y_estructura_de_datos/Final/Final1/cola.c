#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "cola.h"
#include "nodo.h"
#include "persona.h"

struct Cola{
    NodoPtr frente;
    NodoPtr fin;
};

ColaPtr iniciarCola(){
    ColaPtr c = (ColaPtr) malloc (sizeof(struct Cola));
    c->frente = NULL;
    c->fin = NULL;

    return c;
};

void encolar(ColaPtr c, DatoPtr dato){
    PersonaPtr p = (PersonaPtr) dato;

    NodoPtr nuevo = crearNodo(p,NULL);

    if(c->fin){
        setNodo(c->fin, nuevo);
    } else {
        c->frente = nuevo;
    }

    c->fin = nuevo;
};

DatoPtr desencolar(ColaPtr c){
    if(c->frente ==NULL){return NULL;}

    else{
        NodoPtr temp = c->frente;
        DatoPtr dato = getDato(temp);
        c->frente = getNodoSiguiente(temp);

        if(c->frente == NULL) {c->fin = NULL;}
        else{
            liberarNodo(temp);
        }

        return dato;
    }
};

void mostrarCola(ColaPtr c, void (*mostrar)(void*)) {
    NodoPtr actual = c->frente;
    while (actual != NULL) {
        mostrar(getDato(actual));
        actual = getNodoSiguiente(actual);
    }
}
