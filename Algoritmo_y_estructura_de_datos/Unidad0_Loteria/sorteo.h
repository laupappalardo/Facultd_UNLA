#ifndef SORTEO_H_INCLUDED
#define SORTEO_H_INCLUDED

struct LoteriaE;

typedef struct LoteriaE * LoteriaP;

//Constructores
LoteriaP sorteo();

//Destructor
void eliminarSorteo(LoteriaP l);

//Mostrar
void mostrarSorteo(LoteriaP l);

//Busca Aciertos
int buscaAcierto(int v1[8], int v2[20]);

//Mostrar Premio
void mostrarPremio(int a);

//get
int *  getSorteo(LoteriaP l);

// jugar hasta ganar...
void saleOSale(int v1[8]);

#endif // SORTEO_H_INCLUDED
