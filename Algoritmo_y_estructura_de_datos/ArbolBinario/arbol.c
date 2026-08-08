#include <stdio.h>
#include <stdlib.h>
#include "arbol.h"


struct NodoE {
    int dato;
    Nodo izquierda;
    Nodo derecha;
};



 Nodo nuevoNodo(int dato) {
    // Solicitar memoria
     Nodo nodo = (Nodo) malloc(sizeof(struct NodoE));

    // Asignar el dato e iniciar hojas
    nodo->dato = dato;
    nodo->izquierda =NULL;
    nodo->derecha = NULL;

    return nodo;
}

void insertar( Nodo nodo, int dato) {

    // ¿Izquierda o derecha?
    // Si es mayor va a la derecha
    if (dato > nodo->dato) {
        // Tienes espacio a la derecha?
        if (nodo->derecha == NULL) {
            nodo->derecha = nuevoNodo(dato);
        } else {
            // Si la derecha ya está ocupada, recursividad ;)
            insertar(nodo->derecha, dato);
        }
    } else {
        // Si no, a la izquierda
        if (nodo->izquierda == NULL) {
            nodo->izquierda = nuevoNodo(dato);
        } else {
            // Si la izquierda ya está ocupada, recursividad ;)
            insertar(nodo->izquierda, dato);
        }
    }
}


void preorden( Nodo nodo) {
    if (nodo != NULL) {
        printf("%d,", nodo->dato);
        preorden(nodo->izquierda);
        preorden(nodo->derecha);
    }
}

void inorden(Nodo nodo) {
    if (nodo != NULL) {
        inorden(nodo->izquierda);
        printf("%d,", nodo->dato);
        inorden(nodo->derecha);
    }
}

void postorden( Nodo nodo) {
    if (nodo != NULL) {
        postorden(nodo->izquierda);
        postorden(nodo->derecha);
        printf("%d,", nodo->dato);
    }
}


Nodo buscar(Nodo nodo, int dato){
    if (nodo == NULL)
    {
        return NULL;
    }


    if (nodo->dato == dato)
    {
        return nodo;
    }

    else if (dato > nodo->dato)
    {
        printf("No esta el %d != %d --> DERECHA\n", dato, nodo->dato);
        return buscar(nodo->derecha, dato);
    }
    else
    {   printf("No esta el %d != %d --> IZQUIERDA\n", dato, nodo->dato);
        return buscar(nodo->izquierda, dato);
    }
}


// Encontrar el nodo mínimo (para caso 3)
Nodo encontrarMinimo(Nodo nodo) {
    while (nodo && nodo->izquierda != NULL) {
        nodo = nodo->izquierda;
    }
    return nodo;
}

// Eliminar nodo
Nodo eliminar(Nodo raiz, int dato) {
    if (raiz == NULL) return NULL;

    if (dato < raiz->dato) {
        raiz->izquierda = eliminar(raiz->izquierda, dato);
    } else if (dato > raiz->dato) {
        raiz->derecha = eliminar(raiz->derecha, dato);
    } else {
        // Caso 1: Sin hijos
        if (raiz->izquierda == NULL && raiz->derecha == NULL) {
            free(raiz);
            return NULL;
        }
        // Caso 2: Un hijo
        else if (raiz->izquierda == NULL) {
            Nodo temp = raiz->derecha;
            free(raiz);
            return temp;
        }
        else if (raiz->derecha == NULL) {
            Nodo temp = raiz->izquierda;
            free(raiz);
            return temp;
        }
        // Caso 3: Dos hijos
        else {
            Nodo temp = encontrarMinimo(raiz->derecha);
            raiz->dato = temp->dato;
            raiz->derecha = eliminar(raiz->derecha, temp->dato);
        }
    }

    return raiz;
}

