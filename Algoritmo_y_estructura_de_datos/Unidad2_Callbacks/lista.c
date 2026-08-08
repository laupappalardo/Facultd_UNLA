#include <stdio.h>
#include <stdlib.h>

#include "lista.h"
#include "nodo.h"

struct Lista{

    NodoPtr primero;

};


ListaPtr crearLista(){

    ListaPtr lista = (ListaPtr) malloc(sizeof(struct Lista));

    lista->primero = NULL;

    return lista;
};


void mostrarListaGenerica(ListaPtr lista, void (*mostrar)(void*)){

    printf("\n<LISTA>\n");
    NodoPtr actual = getPrimero(lista);

    while (actual!=NULL){
        mostrar(getDato(actual));
        actual = getNodoSiguiente(actual);
    }
    printf("\n\n");
};


NodoPtr getPrimero(ListaPtr lista){
    return lista->primero;
};

void setPrimero(ListaPtr lista, NodoPtr nuevoPrimero){
    lista->primero = nuevoPrimero;

};

void liberarLista(ListaPtr lista) {

    NodoPtr actual = lista->primero;

    while (actual!=NULL){

        free(actual);
        actual = getNodoSiguiente(actual);
    };
}

int obtenerTamanio(ListaPtr lista){
    NodoPtr actual = lista->primero;
    int cont =0;
    while (actual!=NULL){
            cont = cont+1;
            actual = getNodoSiguiente(actual);
    }

    return cont;
};


void insertarPrimero(ListaPtr lista, DatoPtr dato){

    NodoPtr nuevoNodo = crearNodo(dato, getPrimero(lista));

    setPrimero(lista, nuevoNodo);
};

void insertarUltimo(ListaPtr lista, DatoPtr dato){

    NodoPtr actual = lista->primero;

    if(actual==NULL){

        insertarPrimero(lista, dato);

    } else{

        for (int i=0; i<obtenerTamanio(lista)-1; i++){

            actual = getNodoSiguiente(actual);
        }
        //El ultimo dato que creo va a tener una posicion null porque no existe ningun dato en esa posicion
        setNodo(actual,crearNodo(dato, NULL));
    }

};

void insertarPosicion(ListaPtr lista, DatoPtr dato, int posicion){
    int tam = obtenerTamanio(lista);

    if(posicion > tam +1){
        printf("\nERROR. No existe la posicion que indico\n");
    }else{
        if (posicion<0){
            printf("\nERROR. No se pueden insertar en posiciones negativas\n");
        }else{
            if(posicion ==0){
                insertarPrimero(lista, dato);
            }else{
                if(posicion == tam){
                    insertarUltimo(lista, dato);
                }else{
                    NodoPtr actual = lista->primero;

                    for(int i=0; i<posicion-1; i++){
                        //recorro la lista hasta la posicion que quiero -1
                        actual = getNodoSiguiente(actual);
                    }
                    //una vez que llegue a la posicion que quiero "inserto" el dato nuevo
                    //y el puntero sera al dato siguiente.
                    //como el puntero es a una posicion de memoria el resto de la lista no
                    //es necesario cambiarlo
                    setNodo(actual, crearNodo(dato, getNodoSiguiente(actual)));


                }
            }
        }
    }
};

DatoPtr obtenerPrimero(ListaPtr lista){

    return getDato(getPrimero(lista));
};

DatoPtr obtenerUltimo(ListaPtr lista){

    NodoPtr actual = getPrimero(lista);

    for (int i=0; i<obtenerTamanio(lista)-1; i++){

            actual = getNodoSiguiente(actual);
    }
    return getDato(actual);
};

DatoPtr obtenerPosicion(ListaPtr lista, int posicion){

    NodoPtr actual = getPrimero(lista);
    int i=0;
    while (i !=posicion){
            actual = getNodoSiguiente(actual);
            i++;
    }
    return getDato(actual);
};

DatoPtr eliminarPrimero(ListaPtr lista){

    NodoPtr actual = getPrimero(lista);
    DatoPtr datoBorrado = NULL;
    datoBorrado = getDato(actual);

    if(actual==NULL){
        printf("\nNo hay nada que eliminar.");
    }else{
        lista->primero=getNodoSiguiente(actual);

        liberarNodo(actual);
        //lista->primero = actual;

    }
    return datoBorrado;
};

DatoPtr eliminarUltimo(ListaPtr lista){
    NodoPtr actual = getPrimero(lista);

    if(actual==NULL){
        printf("\nNo hay nada que eliminar.");
        return 0;
    }else{
        for (int i=0; i<obtenerTamanio(lista)-2; i++){
            actual = getNodoSiguiente(actual);
        }
        DatoPtr datoBorrado;

        //Guardo en un auxiliar el ultimo nodo que quiero borrar
        NodoPtr aux = getNodoSiguiente(actual);

        //Seteo el anteultimo nodo como ultimo
        setNodo(actual, NULL);

        //Recupero el dato borrado y libero ese ultimo nodo
        datoBorrado = getDato(aux);
        liberarNodo(aux);

        return datoBorrado;
    }

};

DatoPtr eliminarposicion(ListaPtr lista, int posicion){
    int tam = obtenerTamanio(lista);
    DatoPtr datoBorrado = NULL;
    if(posicion > tam +1){
        printf("\nERROR. No existe la posicion que indico\n");
    }else{
        if (posicion<0){
            printf("\nERROR. No se pueden insertar en posiciones negativas\n");
        }else{
            if(posicion ==0){
                eliminarPrimero(lista);
            }else{
                if(posicion == tam){
                    eliminarUltimo(lista);
                }else{
                    NodoPtr actual = lista->primero;

                    for(int i=0; i<posicion-1; i++){
                        //recorro la lista hasta la posicion que quiero -1
                        actual = getNodoSiguiente(actual);
                    }
                    //Redirijo el ultimo "siguiente" que vaya a quedar y luego borro esa posicion
                    NodoPtr aux, aux2;
                    aux = getNodoSiguiente(actual); //este es el que quiero borrar

                    datoBorrado = getDato(aux);
                    aux2 = getNodoSiguiente(aux); //a este tengo que redirigir el "actual"
                    liberarNodo(aux);
                    setNodo(actual,aux2);
                }
            }
        }
    }
    return datoBorrado;
};


void ordenarListaGenerico(ListaPtr lista, int (*funcionComparar)(DatoPtr, DatoPtr)){
    int tam= obtenerTamanio(lista);
    NodoPtr actual = getPrimero(lista);
    DatoPtr aux;

    for(int i=0; i<tam; i++){
        for (int j=0; j<tam-1; j++){

            if(funcionComparar(getDato(actual), getDato(getNodoSiguiente(actual)))){ // Si es 1 actual es mayor que siguiente, 0 si es menor
                aux=getDato(actual);
                setDato(actual, getDato(getNodoSiguiente(actual)));
                setDato(getNodoSiguiente(actual), aux);

            }

            actual = getNodoSiguiente(actual);
        }
        actual=lista->primero;
    }


};


/*int buscarElemento(ListaPtr lista, void * dato){

    NodoPtr actual = getPrimero(lista);
    int tam = obtenerTamanio(lista);
    for (int i=0; i<tam; i++){
        if (getDato(actual) == datoBuscado){
            return i;
        }
        actual = getNodoSiguiente(actual);
    }

    return -1;
};

/*void insertarEnOrden(ListaPtr lista, int dato){

    ordenarLista(lista);
    NodoPtr actual = lista->primero;
    int i=0;
    if (getDato(actual) > dato ) {insertarPrimero(lista, dato);}
    else {
        while ( dato > getDato(actual) && i<obtenerTamanio(lista)-1){
            actual = getNodoSiguiente(actual);
            i++;
            //mostrarNodo(actual);
            //printf("   %d ", i);
        }
        if (i+1 == obtenerTamanio(lista)){insertarUltimo(lista, dato);}
        else{insertarPosicion(lista, dato, i);}


    }

};

*/
