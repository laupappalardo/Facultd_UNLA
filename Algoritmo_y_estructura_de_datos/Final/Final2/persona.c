#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "nodo.h"
#include "pila.h"
#include "persona.h"

struct Persona{
    char nombre[15];
    int dni;
};

PersonaPtr crearPersona(char nombre[15], int dni){

    PersonaPtr p = (PersonaPtr) malloc(sizeof (struct Persona));

    strcpy(p->nombre, nombre);
    p->dni = dni;

    return p;

};

char* getNombre(PersonaPtr p){
    return p->nombre;
};

int getDni(PersonaPtr p){
    return p->dni;
};

//setters
void setNombre(PersonaPtr p, char nuevoNombre[15]){
    strcpy(p->nombre, nuevoNombre);
};

void setDni(PersonaPtr p, int nuevoDni){
    p->dni = nuevoDni;
};

void wrapperPersona(DatoPtr dato){
    PersonaPtr p = (PersonaPtr) dato;

    mostrarPersona(p);
};

void mostrarPersona(PersonaPtr p){
    printf("\n Persona: Nombre %s - DNI: %d\n", p->nombre, p->dni);
};

