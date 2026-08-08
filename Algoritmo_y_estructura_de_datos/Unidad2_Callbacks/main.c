#include <stdio.h>
#include <stdlib.h>

#include "lista.h"
#include "nodo.h"
#include "persona.h"
#include "enteros.h"

int main()
{
    printf("\n----- INT ------\n");
    int tam;
    ListaPtr lista = crearLista();

    int n1=4, n2=11, n3=59, n4=35, n5=3;

    insertarPrimero(lista, &n1);
    insertarPrimero(lista, &n2);
    insertarUltimo(lista, &n3);
    insertarPosicion(lista, &n4,2);
    insertarPosicion(lista, &n5,3);

    ordenarListaGenerico(lista, compararInt);
    mostrarListaGenerica(lista, &wrapperInt);


    printf("\n----- FLOAT ------\n");
    ListaPtr listaFloat = crearLista();

    float f1=4.69, f2=11.2, f3=59.6, f4=35.364, f5=3.78;

    insertarPrimero(listaFloat, &f1);
    insertarPrimero(listaFloat, &f2);
    insertarUltimo(listaFloat, &f3);
    insertarPosicion(listaFloat, &f4,2);
    insertarPosicion(listaFloat, &f5,3);

    ordenarListaGenerico(listaFloat, compararFloat);
    mostrarListaGenerica(listaFloat, &wrapperFloat);

    printf("\n----- CHAR ------\n");
    ListaPtr listaChar = crearLista();

    PersonaP p1 = crearPersona(32, "Laura");
    PersonaP p2 = crearPersona(36, "Emiliano");
    PersonaP p3= crearPersona(84, "Marce");
    PersonaP p4=crearPersona(620, "Felipe");

    insertarPrimero(listaChar, p1);
    insertarPrimero(listaChar, p2);
    insertarUltimo(listaChar, p3);
    insertarPosicion(listaChar, p4,2);

    ordenarListaGenerico(listaChar, compararPersona);
    mostrarListaGenerica(listaChar, &wrapperPersona);

    return 0;
}
