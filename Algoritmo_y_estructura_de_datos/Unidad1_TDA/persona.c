#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "persona.h"
#include "fecha.h"
#include "dispositivo.h"

struct PersonaE{
    char nombre[20];
    char apellido[30];
    int dni;

    DispositivoP dispositivo;
    FechaP fechaNacimiento;
};

PersonaP crearPersona(char n[20], char ap[30], int dd, int a, int m, int d ){
    PersonaP p = (PersonaP) malloc(sizeof (struct PersonaE));
    strcpy(p->nombre, n);
    strcpy(p->apellido, ap);
    p->dni = dd;

    p->dispositivo = crearDispositivoVacio();
    p->fechaNacimiento = crearFecha(a, m, d);
    return p;
};

void mostrarPersona(PersonaP p){
    printf("\nInformacion de la persona: \n");
    printf("Nombre: %s\n", p->nombre);
    printf("Apellido: %s\n", p->apellido);
    printf("DNI: %d\n", p->dni);

    mostrarDispositivo(p->dispositivo);

    mostrarFecha(p->fechaNacimiento);

};


// Getters


char* getNombrePersona(PersonaP p) {
    return p->nombre;
}


char* getApellidoPersona(PersonaP p){
    return p->apellido;
};

int getDniPersona(PersonaP p){
    return p->dni;
};


// Setters

void setNombrePersona(PersonaP p, char nombre[]) {
    strcpy(p->nombre, nombre);
}


void setApellidoPersona(PersonaP p, char ap[20]){

    strcpy(p->apellido, ap);

}

void setDniPersona(PersonaP p, int dd){

    p->dni = dd;

}
