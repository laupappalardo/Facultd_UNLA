#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "persona.h"
#include "fecha.h"
#include "empleado.h"
#include "dispositivo.h"

int main(){

    EmpleadoP e1;
    e1 = crearEmpleado("Laura",  "Pappalardo", 32042204, 1986,1,26,235,1000000,"SMN");
    mostrarEmpleado(e1);

    setNombreEmpleado(e1, "Ines");
    mostrarEmpleado(e1);

    setApellidoEmpleado(e1, "Gonzalez");

    char nombre[20];
    strcpy(nombre, getApellidoEmpleado(e1));
    printf("El apellido es: %s", nombre);



    return 0;
}



