#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "carton.h"
#include "jugador.h"
#include "sorteo.h"
#include "fecha.h"


struct JugadorE{
    int dni;
    char nombre[15];
    CartonP c;
};

//Constructores
JugadorP crearJugador(int d, char n[15]){
    JugadorP j = (JugadorP) malloc(sizeof(struct JugadorE));
    j->dni = d;
    strcpy (j-> nombre, n);
    j->c = crearCartonVacio();

    return j;
};

//Destructor
void eliminarJugador(JugadorP j){
    free(j);
};

//Mostrar
void mostrarJugador(JugadorP j){
    printf("\n\n* JUGADOR:   \n");
    printf("Nombre:  %s \n", j->nombre);
    printf("DNI:  %d \n ", j->dni);
    mostrarCarton(j->c);
};

void agregarCartonAutomatico(JugadorP j, char d[15], int dd, int m, int y){
    j->c = crearCartonAutomatico(d, dd, m, y);
};

void agregarCartonPersonalizado(JugadorP j, char d[15], int dd, int m, int y){

    j->c = crearCartonPersonalizado(d, dd, m, y);

}

CartonP getCartonCompleto(JugadorP j){
    return j->c;
};








