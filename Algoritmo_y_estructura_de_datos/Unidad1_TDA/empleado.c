#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "persona.h"
#include "fecha.h"
#include "empleado.h"
#include "dispositivo.h"

struct EmpleadoE{
    PersonaP persona;
    int legajo;
    int sueldo;
    char empresa[20];
};

EmpleadoP crearEmpleado( char n[20], char ap[30], int dd, int a, int m, int d , int l,  int s, char emp[20]){

    EmpleadoP e= (EmpleadoP) malloc(sizeof (struct EmpleadoE));

    e->persona = crearPersona(n, ap, dd, a, m, d);
    e->legajo =l;
    e->sueldo =s;
    strcpy(e->empresa, emp);

    return e;
};

void mostrarEmpleado(EmpleadoP e){
    printf("\nEl empleado es: \n");
    mostrarPersona(e->persona);
    printf("Legajo: %d\n", e->legajo);
    printf ("Sueldo: %d\n", e->sueldo);
    printf("Empresa: %s\n", e->empresa);

};


// Getters

char* getNombreEmpleado(EmpleadoP e){
    return getNombrePersona(e->persona);
}

char* getApellidoEmpleado(EmpleadoP e){
    return getApellidoPersona(e->persona);
}


int getSueldo(EmpleadoP e){
    return e->sueldo;

};

int getLegajo(EmpleadoP e){
    return e->legajo;

};

char* getEmpresa(EmpleadoP e){
    return e->empresa;
}


// Setters

void setNombreEmpleado(EmpleadoP e, char nombre[]){
    setNombrePersona(e->persona, nombre);
}

void setApellidoEmpleado(EmpleadoP e, char nombre[]){
    setApellidoPersona(e->persona, nombre);
}


void setSueldo(EmpleadoP e, int s){

    e->sueldo = s;

}

void setLegajo(EmpleadoP e, int l){

    e->sueldo = l;

}

void setEmpresa(EmpleadoP e, char emp[20]){

    strcpy(e->empresa, emp);
}


