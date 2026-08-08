#ifndef PILA_H_INCLUDED
#define PILA_H_INCLUDED

struct Pila;
typedef struct Pila * PilaPtr;

PilaPtr iniciarPila();
void apilar(PilaPtr pila, DatoPtr dato);
DatoPtr desapilar(PilaPtr pila);
DatoPtr verTope(PilaPtr pila);

void mostrarPila(PilaPtr pila, void (*mostrar) (void*));

//void destruirPila(PilaPtr pila);



#endif // PILA_H_INCLUDED
