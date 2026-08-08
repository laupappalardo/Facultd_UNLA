#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "nodo.h"
#include "persona.h"
#include "cola.h"
#include "estadio.h"

struct Estadio{
    char nombre[15];
    int capacidad;
    char localidad[15];

    ColaPtr colaPersonas;
};

EstadioPtr crearEstadio(char n[15], int c, char l[15]){

    EstadioPtr e = (EstadioPtr) malloc (sizeof(struct Estadio));
    strcpy(e->nombre, n);
    e->capacidad = c;
    strcpy(e->localidad, l);

    e->colaPersonas = iniciarCola();

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

ColaPtr getColaPersonas(EstadioPtr e){
    return e->colaPersonas;
};

//Setters
void setNombreEstadio(EstadioPtr e, char n[15]){
    strcpy(e->nombre, n);
};

void setCapacidad(EstadioPtr e, int c){
    e->capacidad = c;
};

void setLocalidad(EstadioPtr e, char l[15]){
    strcpy(e->localidad, l);
};

void agregarPersona(EstadioPtr e, PersonaPtr p){
    encolar(e->colaPersonas, p);
};

PersonaPtr desagregarPersona(EstadioPtr e){
    PersonaPtr p;
    p = desencolar(e->colaPersonas);
    return p;
};

void mostrarEstadio(EstadioPtr e){
    printf("Estadio: \n");
    printf("   Nombre: %s - Localidad: %s - Capacidad: %d", e->nombre, e->localidad, e->capacidad);

    mostrarCola(getColaPersonas(e), &wrapperPersona);

};
