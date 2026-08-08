#ifndef JUGADOR_H_INCLUDED
#define JUGADOR_H_INCLUDED

struct JugadorE;
typedef struct JugadorE * JugadorP;

//Constructores
JugadorP crearJugador(int d, char n[15]);

//Destructor
void eliminarJugador(JugadorP j);

//Mostrar
void mostrarJugador(JugadorP j);

//Agregar carton
void agregarCartonAutomatico(JugadorP j, char d[15], int dd, int m, int y);
void agregarCartonPersonalizado(JugadorP j, char d[15], int dd, int m, int y);

//getter
CartonP getCartonCompleto(JugadorP j);


#endif // JUGADOR_H_INCLUDED


