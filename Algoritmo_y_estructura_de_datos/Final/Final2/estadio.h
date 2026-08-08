#ifndef ESTADIO_H_INCLUDED
#define ESTADIO_H_INCLUDED

#include "persona.h"

struct Estadio;
typedef struct Estadio * EstadioPtr;

EstadioPtr crearEstadio(char nombre[15], int capacidad, char localidad[15]);

//Getters
char* getNombreEstadio(EstadioPtr e);
int getCapacidad(EstadioPtr e);
char* getLocalidad(EstadioPtr e);
PilaPtr getPila(EstadioPtr e);

//Setters
void setNombreEstadio(EstadioPtr e, char nuevoNombre[15]);
void setCapacidad(EstadioPtr e, int capacidad);
void setLocalidad(EstadioPtr e, char nuevaLocalidad[15]);

void mostrarEstadio(EstadioPtr e);

void apilarPersona(EstadioPtr e, PersonaPtr p);
PersonaPtr desapilarPersona(EstadioPtr e);

#endif // ESTADIO_H_INCLUDED
