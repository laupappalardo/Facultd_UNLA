#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "dispositivo.h"

struct DispositivoE{
    char nombre[20];
    char marca[20];
    int precio;
    int memoria;
};

DispositivoP crearDispositivoVacio(){
    DispositivoP d= (DispositivoP) malloc(sizeof (struct DispositivoE));

    strcpy(d->nombre, "VACIO");
    strcpy(d->marca, "VACIO");
    d->precio = -1;
    d->memoria = -1;

    return d;
};

DispositivoP crearDispositivo(char n[20], char m[20], int p, int mem){
    DispositivoP d= (DispositivoP) malloc(sizeof (struct DispositivoE));

    strcpy(d->nombre, n);
    strcpy(d->marca, m);
    d->precio = p;
    d->memoria = mem;

    return d;

};

void mostrarDispositivo(DispositivoP d){
    printf("\nInformacion del dispositivo: \n");
    printf("Nombre: %s\n", d->nombre);
    printf("Marca: %s\n", d->marca);
    printf("Precio: %d\n", d->precio);
    printf("Memoria: %d\n", d->memoria);
};





