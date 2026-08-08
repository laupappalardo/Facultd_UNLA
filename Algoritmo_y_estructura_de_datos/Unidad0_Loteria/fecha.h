#ifndef FECHA_H_INCLUDED
#define FECHA_H_INCLUDED

struct fechaE;
typedef struct fechaE * fechaP;

//Constructor
fechaP crearFecha(int d, int m, int y);
fechaP crearFechaVacia();

//mostrar fecha
mostrarFecha(fechaP f);

//Getter
int getDia(fechaP f);
int getMes(fechaP f);
int getYear(fechaP f);

//Verificar si es domingo
int verificaFecha(fechaP f);

#endif // FECHA_H_INCLUDED
