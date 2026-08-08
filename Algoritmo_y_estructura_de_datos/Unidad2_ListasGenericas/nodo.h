#ifndef NODO_H_INCLUDED
#define NODO_H_INCLUDED

struct Nodo;

typedef struct Nodo * NodoPtr;
typedef void * DatoPtr;

NodoPtr crearNodo(DatoPtr dato, NodoPtr siguiente);
void mostrarNodoInt(NodoPtr nodo);
void mostrarNodoFloat(NodoPtr nodo);
void mostrarNodoChar(NodoPtr nodo);
void liberarNodo(NodoPtr nodo);

// Getters
DatoPtr getDato(NodoPtr nodo);
NodoPtr getNodoSiguiente(NodoPtr nodo);

// Setters
void setDato(NodoPtr nodo, DatoPtr dato);
void setNodo(NodoPtr nodo, NodoPtr nuevoNodo);




#endif // NODO_H_INCLUDED
