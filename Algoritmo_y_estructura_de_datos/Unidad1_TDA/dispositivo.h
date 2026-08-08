#ifndef DISPOSITIVO_H_INCLUDED
#define DISPOSITIVO_H_INCLUDED

struct DispositivoE;

typedef struct DispositivoE * DispositivoP;

DispositivoP crearDispositivoVacio();

DispositivoP crearDispositivo(char n[20], char m[20], int p, int mem);

void mostrarDispositivo(DispositivoP d);

#endif // DISPOSITIVO_H_INCLUDED
