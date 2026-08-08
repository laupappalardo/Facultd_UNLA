#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

#include "carton.h"
#include "jugador.h"
#include "sorteo.h"
#include "fecha.h"


struct fechaE{
    int dia;
    int mes;
    int year;
};

fechaP crearFecha(int d, int m, int y){

    fechaP f = (fechaP) malloc(sizeof(struct fechaE));
    f->dia = d;
    f->mes = m;
    f->year = y;

    return f;

};

fechaP crearFechaVacia(){

    fechaP f = (fechaP) malloc(sizeof(struct fechaE));
    f->dia = -1;
    f->mes = -1;
    f->year = -1;

    return f;

};

mostrarFecha(fechaP f){

    printf("\nLa fecha es: %d - %d - %d \n", f->dia, f->mes, f->year);

};

int getDia(fechaP f){
    return f->dia;

};

int getMes(fechaP f){
    return f->mes;
};

int getYear(fechaP f){
    return f->year;
};


int verificaFecha(fechaP f){

    struct tm tiempo = {0};
    tiempo.tm_mday = f->dia;
    tiempo.tm_mon = f->mes - 1;  // tm_mon va de 0 (enero) a 11 (diciembre)
    tiempo.tm_year = f->year - 1900;  // tm_year es el número de años desde 1900

    mktime(&tiempo);  // Convierte a tiempo en formato de `struct tm`

    tiempo.tm_wday == 0;  // 0 representa el domingo

    if (tiempo.tm_wday == 0) {
        printf("Es domingo! Hay sorteo\n");
    } else {
        printf("No es domingo. No hay sorteo\n");
    }

    return tiempo.tm_wday;
};

