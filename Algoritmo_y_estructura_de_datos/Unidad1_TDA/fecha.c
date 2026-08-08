#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "fecha.h"

struct FechaE{
    int anio;
    int mes;
    int dia;

};

FechaP crearFecha(int a, int m, int d){
    FechaP f = (FechaP) malloc(sizeof (struct FechaE));

    f->anio = a;
    f->mes =m;
    f->dia =d;

    return f;
};

void mostrarFecha(FechaP f){
    printf("La fecha de nacimiento es: ");
    printf("%d - %d - %d \n", f->anio, f->mes, f->dia);
};
