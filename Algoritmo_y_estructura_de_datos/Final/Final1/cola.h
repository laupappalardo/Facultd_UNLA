#ifndef COLA_H_INCLUDED
#define COLA_H_INCLUDED

#include "nodo.h"

struct Cola;
typedef struct Cola * ColaPtr;

ColaPtr iniciarCola();
void encolar(ColaPtr c, DatoPtr dato);
DatoPtr desencolar(ColaPtr c);

void mostrarCola(ColaPtr c, void (*mostrar)(void*));

#endif // COLA_H_INCLUDED
