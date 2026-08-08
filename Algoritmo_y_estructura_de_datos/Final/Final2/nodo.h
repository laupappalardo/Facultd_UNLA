#ifndef NODO_H_INCLUDED
#define NODO_H_INCLUDED

struct Nodo;
typedef struct Nodo * NodoPtr;

typedef void * DatoPtr;

NodoPtr crearNodo(DatoPtr dato, NodoPtr siguiente);

//Getter
DatoPtr getDato(NodoPtr nodo);
NodoPtr getNodoSiguiente(NodoPtr nodo);

//Setters
void setNodo(NodoPtr nodo, DatoPtr dato);
void setNodoSiguiente(NodoPtr nodo, NodoPtr siguiente);



#endif // NODO_H_INCLUDED
