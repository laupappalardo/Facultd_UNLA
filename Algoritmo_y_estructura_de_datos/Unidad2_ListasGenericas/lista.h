#ifndef LISTA_H_INCLUDED
#define LISTA_H_INCLUDED

#include "nodo.h"

struct Lista;

typedef struct Lista * ListaPtr;

ListaPtr crearLista();

void mostrarListaInt(ListaPtr lista);
void mostrarListaFloat(ListaPtr lista);
void mostrarListaChar(ListaPtr lista);
void liberarLista(ListaPtr lista);

NodoPtr getPrimero(ListaPtr lista);
void setPrimero(ListaPtr lista, NodoPtr nuevoPrimero);

void insertarPrimero(ListaPtr lista, DatoPtr dato);
void insertarUltimo(ListaPtr lista, DatoPtr dato);
void insertarPosicion(ListaPtr lista, DatoPtr dato, int posicion);

DatoPtr obtenerPrimero(ListaPtr lista);
DatoPtr obtenerUltimo(ListaPtr lista);
DatoPtr obtenerPosicion(ListaPtr lista, int posicion);

DatoPtr eliminarPrimero(ListaPtr lista);
DatoPtr eliminarUltimo(ListaPtr lista);
DatoPtr eliminarposicion(ListaPtr lista, int posicion);

int obtenerTamanio(ListaPtr lista);

/*void ordenarLista(ListaPtr lista);
ListaPtr ordenarListaCopia(ListaPtr lista);*/
ListaPtr duplicarLista(ListaPtr lista);

/*int buscarElemento(ListaPtr lista, int datoBuscado);

void insertarEnOrden(ListaPtr lista, int dato);

*/

#endif // LISTA_H_INCLUDED
