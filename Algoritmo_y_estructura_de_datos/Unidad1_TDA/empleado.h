#ifndef EMPLEADO_H_INCLUDED
#define EMPLEADO_H_INCLUDED

struct EmpleadoE;

typedef struct EmpleadoE * EmpleadoP;

EmpleadoP crearEmpleado(char n[20], char ap[30], int dd, int a, int m, int d , int l,  int s, char emp[20]);

void mostrarEmpleado(EmpleadoP e);

// Getters

char* getNombreEmpleado(EmpleadoP e);
char* getApellidoEmpleado(EmpleadoP e);
int getSueldo(EmpleadoP e);
int getLegajo(EmpleadoP e);
char* getEmpresa(EmpleadoP e);

// Setters
void setNombreEmpleado(EmpleadoP e, char nombre[]);
void setApellidoEmpleado(EmpleadoP e, char nombre[]);
void setSueldo(EmpleadoP e, int s);
void setLegajo(EmpleadoP e, int l);
void setEmpresa(EmpleadoP e, char emp[20]);



#endif // EMPLEADO_H_INCLUDED
