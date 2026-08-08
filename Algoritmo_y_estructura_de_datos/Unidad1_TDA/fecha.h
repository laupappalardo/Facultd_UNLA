#ifndef FECHA_H_INCLUDED
#define FECHA_H_INCLUDED

struct FechaE;

typedef struct FechaE * FechaP;

FechaP crearFecha(int a, int m, int d);

void mostrarFecha(FechaP f);


#endif // FECHA_H_INCLUDED
