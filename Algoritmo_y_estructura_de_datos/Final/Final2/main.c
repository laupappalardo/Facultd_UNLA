#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "nodo.h"
#include "pila.h"
#include "persona.h"
#include "estadio.h"

int main(){

    EstadioPtr e = crearEstadio("Unico", 60000, "Lanus");

    PersonaPtr p1 = crearPersona("Laura", 3200000);
    PersonaPtr p2 = crearPersona("Marcelo", 3100000);
    PersonaPtr p3 = crearPersona("Emiliano", 5900000);
    PersonaPtr p4 = crearPersona("Jose", 3000000);
    PersonaPtr p5 = crearPersona("Merlina", 4500000);

    apilarPersona(e, p3);
    apilarPersona(e, p2);
    apilarPersona(e, p1);
    apilarPersona(e, p4);
    apilarPersona(e, p5);

    mostrarEstadio(e);

    PersonaPtr p6 = desapilar(getPila(e));
    mostrarPersona(p6);

    return 0;
};

