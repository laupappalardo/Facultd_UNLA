#include <stdio.h>
#include <stdlib.h>

#include "lista.h"
#include "nodo.h"

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

    mostrarListaInt(lista);
    tam=obtenerTamanio(lista);
    printf("\nEl tamanio de la lista es: %d", tam);

    printf("\n----- FLOAT ------\n");
    ListaPtr listaFloat = crearLista();

    float f1=4.69, f2=11.2, f3=59.6, f4=35.364, f5=3.78;

    insertarPrimero(listaFloat, &f1);
    insertarPrimero(listaFloat, &f2);
    insertarUltimo(listaFloat, &f3);
    insertarPosicion(listaFloat, &f4,2);
    insertarPosicion(listaFloat, &f5,3);

    mostrarListaFloat(listaFloat);
    tam=obtenerTamanio(listaFloat);
    printf("\nEl tamanio de la lista es: %d", tam);

    printf("\n----- CHAR ------\n");
    ListaPtr listaChar = crearLista();

    char c1[]="Laura", c2[]="Emiliano", c3[]="Marce", c4[]="Felipe", c5[]="Merlina";

    insertarPrimero(listaChar, c1);
    insertarPrimero(listaChar, c2);
    insertarUltimo(listaChar, c3);
    insertarPosicion(listaChar, c4,2);
    insertarPosicion(listaChar, c5,3);

    mostrarListaChar(listaChar);
    tam=obtenerTamanio(listaChar);
    printf("\nEl tamanio de la lista es: %d", tam);
    return 0;
}
