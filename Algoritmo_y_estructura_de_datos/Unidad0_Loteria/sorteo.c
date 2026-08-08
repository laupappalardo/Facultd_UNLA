#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

#include "sorteo.h"
#include "carton.h"

struct LoteriaE{
    int vec[20];
};

//Constructores
LoteriaP sorteo(){
    LoteriaP l = malloc (sizeof(struct LoteriaE));

    for(int i=0; i<20; i++){
            l->vec[i]= rand()%100;
    };
    return l;
};

//Destructor
void eliminarSorteo(LoteriaP l){
    free(l);
};

//Mostrar
void mostrarSorteo(LoteriaP l){
    ordenaCarton(l->vec, 20);
    printf("\n\n\n Numeros Sorteados : \n");
    for(int i=0; i<20; i++){
        printf(" %d  -  ", l->vec[i]);
    }

};

int buscaAcierto(int v1[8], int v2[20]){
    FILE * archivoP = fopen("resultado.txt", "a");

    int aciertos = 0;
    printf("\n\n\n El carton jugado fue:   ");
    for (int i=0; i<8; i++){
        int control = 0;
        for(int j=0; j<20; j++) {
            if(v1[i] == v2[j]){
                aciertos=aciertos+1;
                control =1;
                printf("  \033[34m %d  \033[m   ", v1[i]);
                fprintf(archivoP, "  \033[34m %d  \033[m   ", v1[i]);
                break;
            }
        }
        if (control == 0){
            printf(" %d  ", v1[i]);
            fprintf(archivoP, " %d  ", v1[i]);
        }
    };
    return aciertos;
    fclose(archivoP);
};


//Mostrar Premio
void mostrarPremio(int a){
    switch(a){
        case 8: printf("\n8 aciertos! Ganó $11 millones!!\n");
        break;

        case 7: printf("\n7 aciertos! Ganó $20.000!!\n");
        break;

        case 6: printf("\n6 aciertos! Ganó $500!!\n");
        break;

        case 5: printf("\n5 aciertos! $50!!\n");
        break;

        default: printf("\nUsted tuvo menos de 5 aciertos. Mejor suerte la proxima!\n");

    }

};


//get
int *  getSorteo(LoteriaP l){
    return l->vec;

};

void saleOSale(int v1[8]){
    int cantidad = 0;
    int aciertos=0;
    LoteriaP s;
    while(aciertos !=8){
        aciertos = 0;
        s = sorteo();
        for (int i=0; i<8; i++){
            for(int j=0; j<20; j++) {
                if(v1[i] == s->vec[j]){
                    aciertos=aciertos+1;
                    break;
                };
            }
        }
        cantidad = cantidad + 1;
    }
    printf("\n Usted gano luego de %d intentos \n", cantidad);
    printf("\n Los numeros del Sale o Sale fueron:");
    mostrarSorteo(s);
};
