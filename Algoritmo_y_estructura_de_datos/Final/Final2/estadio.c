#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "nodo.h"
#include "pila.h"
#include "estadio.h"
#include "persona.h"

struct Estadio{
    char nombre[15];
    int capacidad;
    char localidad[15];

    PilaPtr pilaPersonas;
};

EstadioPtr crearEstadio(char nombre[15], int capacidad, char localidad[15]){

    EstadioPtr e =(EstadioPtr) malloc(sizeof( struct Estadio));
    strcpy(e->nombre, nombre);
    e->capacidad = capacidad;
    strcpy(e->localidad, localidad);

    e->pilaPersonas = iniciarPila();
    return e;
};

//Getters
char* getNombreEstadio(EstadioPtr e){
    return e->nombre;
};

int getCapacidad(EstadioPtr e){
    return e->capacidad;
};

char* getLocalidad(EstadioPtr e){
    return e->localidad;
};

PilaPtr getPila(EstadioPtr e){
    return e->pilaPersonas;
};

//Setters
void setNombreEstadio(EstadioPtr e, char nuevoNombre[15]){
    strcpy(e->nombre, nuevoNombre);
};

void setCapacidad(EstadioPtr e, int capacidad){
    e->capacidad = capacidad;
};

void setLocalidad(EstadioPtr e, char nuevaLocalidad[15]){
    strcpy(e->localidad, nuevaLocalidad);
};

void mostrarEstadio(EstadioPtr e){
    printf("\n Estadio - %s\n", e->nombre);
    printf(" Localidad: %s - Capacidad: %d", e->localidad, e->capacidad);

    mostrarPila(e->pilaPersonas, &wrapperPersona);

};

void apilarPersona(EstadioPtr e, PersonaPtr p){
    apilar(e->pilaPersonas, p);
};

PersonaPtr desapilarPersona(EstadioPtr e){

    PersonaPtr p = (PersonaPtr) desapilar(e->pilaPersonas);

    return p;
};

