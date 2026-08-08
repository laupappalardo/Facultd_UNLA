#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "persona.h"

struct PersonaE{
    int dni;
    char nombre[15];
};

//Constructores
PersonaP crearPersona(int d, char n[15]){
    PersonaP p = (PersonaP) malloc(sizeof(struct PersonaE));
    p->dni = d;
    strcpy (p-> nombre, n);
    return p;
};

//Destructor
void eliminarPersona(PersonaP p){
    free(p);
};

//Mostrar
void mostrarPersona(PersonaP p){
    printf("\n\n* Persona:   \n");
    printf("Nombre:  %s \n", p->nombre);
    printf("DNI:  %d \n", p->dni);

};

//Wrapper
void wrapperPersona(void * dato){

    PersonaP p = (PersonaP) dato;

    mostrarPersona(p);

};

//Comparacion Char
int compararPersona(void * dato1, void * dato2){

    PersonaP p1 = (PersonaP) dato1;
    PersonaP p2 = (PersonaP) dato2;

    return p1->dni > p2->dni;

};








