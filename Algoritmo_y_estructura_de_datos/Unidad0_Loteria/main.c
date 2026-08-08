#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

#include "carton.h"
#include "jugador.h"
#include "sorteo.h"
#include "fecha.h"

int main(){
    srand(time(0));

    //Chequeo funcionamiento jugador
    JugadorP j1;
    j1 = crearJugador(32042204, "Laura");
    mostrarJugador(j1);

    //Chequeo funcionamiento carton
    /*CartonP c1;
    c1 = crearCarton("Palma 3352");
    mostrarCarton(c1);*/

    //Juego....
    agregarCartonAutomatico(j1, "Palma 3352", 3,4,2025);
    //agregarCartonPersonalizado(j1, "Palma 3352");
    mostrarJugador(j1);

    CartonP c1 = getCartonCompleto(j1);
    fechaP f1 = getFecha(c1);
    int ver = verificaFecha(f1);

    //Sorteo solo si es domingo
    if(ver == 0 ){

        LoteriaP s1;
        s1 = sorteo();
        mostrarSorteo(s1);

        int aciertos = buscaAcierto(getCarton(c1), getSorteo(s1));
        mostrarPremio(aciertos);

        saleOSale(getCarton(c1));

    }


    return 0;
}
