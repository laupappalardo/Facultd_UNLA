#ifndef CARTON_H_INCLUDED
#define CARTON_H_INCLUDED

struct CartonE;
typedef struct CartonE * CartonP;
struct fechaE;
typedef struct fechaE * fechaP;

//Constructores
CartonP crearCartonAutomatico(char d[15], int dd, int m, int y);
CartonP crearCartonVacio();
CartonP crearCartonPersonalizado(char d[15], int dd, int m, int y);

//Destructor
void eliminarCarton(CartonP c);

//Mostrar
void mostrarCarton(CartonP c);

//Busca repetidos y corregir
void hayRepetidos(int v[8]);

//Ordenar carton
void ordenaCarton(int v[], int tam);

int *  getCarton(CartonP c);

fechaP getFecha(CartonP c);

#endif // CARTON_H_INCLUDED
