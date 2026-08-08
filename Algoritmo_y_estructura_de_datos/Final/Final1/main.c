#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "nodo.h"
#include "persona.h"
#include "cola.h"
#include "estadio.h"

int main(){

    EstadioPtr estadio = crearEstadio("Kempes", 50000, "Cordoba");

    PersonaPtr p1 = crearPersona("Laura", 3200000);
    PersonaPtr p2 = crearPersona("Marcelo", 3100000);
    PersonaPtr p3 = crearPersona("Emiliano", 5900000);
    PersonaPtr p4 = crearPersona("Jose", 3000000);
    PersonaPtr p5 = crearPersona("Merlina", 4500000);

    agregarPersona(estadio, p3);
    agregarPersona(estadio, p2);
    agregarPersona(estadio, p1);
    agregarPersona(estadio, p4);
    agregarPersona(estadio, p5);

    mostrarEstadio(estadio);


    PersonaPtr personaDesencolada = desencolar(getColaPersonas(estadio));
    wrapperPersona(personaDesencolada);
    return 0;
};



