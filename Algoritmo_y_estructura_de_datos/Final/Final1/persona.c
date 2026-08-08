#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "nodo.h"
#include "persona.h"

struct Persona{
    char nombre[15];
    int dni;
};

PersonaPtr crearPersona(char n[15], int d){
    PersonaPtr p = (PersonaPtr) malloc(sizeof(struct Persona));
    strcpy(p->nombre, n);
    p->dni = d;

    return p;
};

//Getter
char* getNombre(PersonaPtr p){
    return p->nombre;
};

int getDni(PersonaPtr p){
    return p->dni;
};

//Setter
void setNombre(PersonaPtr p, char n[15]){
    strcpy(p->nombre, n);
};

void setDni(PersonaPtr p, int nuevoDni){
    p->dni = nuevoDni;
};

void wrapperPersona(void * dato){
    PersonaPtr p = (PersonaPtr) dato;

    mostrarPersona(p);
};

void mostrarPersona(PersonaPtr p){
    printf("\n Persona: Nombre:  %s - DNI: %d \n", p->nombre, p->dni);
};


