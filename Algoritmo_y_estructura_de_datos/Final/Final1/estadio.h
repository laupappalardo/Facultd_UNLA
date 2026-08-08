#ifndef ESTADIO_H_INCLUDED
#define ESTADIO_H_INCLUDED

#include "persona.h"
#include "cola.h"

struct Estadio;
typedef struct Estadio * EstadioPtr;

struct Cola;
typedef struct Cola * ColaPtr;

EstadioPtr crearEstadio(char n[15], int c, char l[15]);

//Getters
char* getNombreEstadio(EstadioPtr e);
int getCapacidad(EstadioPtr e);
char* getLocalidad(EstadioPtr e);
ColaPtr getColaPersonas(EstadioPtr e);

//Setters
void setNombreEstadio(EstadioPtr e, char n[15]);
void setCapacidad(EstadioPtr e, int c);
void setLocalidad(EstadioPtr e, char l[15]);

void agregarPersona(EstadioPtr e, PersonaPtr p);
PersonaPtr desagregarPersona(EstadioPtr e);

void mostrarEstadio(EstadioPtr e);

#endif // ESTADIO_H_INCLUDED
