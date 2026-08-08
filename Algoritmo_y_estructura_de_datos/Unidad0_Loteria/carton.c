#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

#include "carton.h"
#include "jugador.h"
#include "sorteo.h"
#include "fecha.h"

struct CartonE{
    int vec[8];
    char direccion[15];
    fechaP f;
};

//Constructores
CartonP crearCartonAutomatico(char d[15], int dd, int m, int y){

    CartonP c = malloc (sizeof(struct CartonE));

    strcpy(c->direccion, d);

    for(int i=0; i<8; i++){
        c->vec[i] = rand()%100;
    };

    //Chequeo repetidos y los cambio
    hayRepetidos(c->vec);

    c->f = crearFecha(dd,m,y);
    return c;
};

CartonP crearCartonVacio(){
    CartonP c = malloc (sizeof(struct CartonE));

    strcpy(c->direccion, "VACIO");

    for(int i=0; i<8; i++){
            c->vec[i]=-1;
    };

    c->f = crearFechaVacia();
    return c;
};

CartonP crearCartonPersonalizado(char d[15], int dd, int m, int y){

    CartonP c = malloc (sizeof(struct CartonE));
    printf("\n Ingrese los numeros que desea jugar de a uno: \n");
    for (int i=0; i<8; i++){
        scanf("%d", &c->vec[i]);
    }

    c->f = crearFecha(dd, m, y);

    return c;
};

//Destructor
void eliminarCarton(CartonP c){
    free(c);
};

//Mostrar
void mostrarCarton(CartonP c){
    ordenaCarton(c->vec, 8);
    printf("\n Tu carton es : \n");
    for(int i=0; i<8; i++){
        printf(" %d  -  ", c->vec[i]);
    }
     mostrarFecha(c->f);
}

//Busca repetidos y corregir
void hayRepetidos(int v[8]){
    int control=0;
    for(int i=0; i<8-1; i++){
        for(int j=i+1; j<8; j++){
            if (v[ i ] == v[ j ]){
                int aux = 1+ rand()%30;
                v[i]=aux;
                control=1;
            }
        }
    }

    if (control == 1){hayRepetidos(v);}
};


//Ordena
void ordenaCarton(int v[], int tam){
    /*x Seleccion -> no funciona
    for (int i=0; i<tam; i++){
        int maximo=i;
        for(int j=i+1; j<tam; j++){
            if(v[i] < v[j] ){
                maximo=j;
            }
        }
        int aux = v[ i ];
        v[ i ] = v[ maximo];
        v[ maximo ] =aux;
    };*/

    for(int i=0; i<tam-1; i++){
        for(int j=1; j<tam; j++){
            if(v[ j ] < v[ j-1 ]) {
                int aux= v[ j ];
                v[ j ] =v[ j-1 ];
                v[ j-1 ]=aux;
            }
        }
    }
};

int *  getCarton(CartonP c){
    return c->vec;
};

fechaP getFecha(CartonP c){
    return c->f;

}





