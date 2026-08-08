#ifndef PERSONA_H_INCLUDED
#define PERSONA_H_INCLUDED

struct PersonaE;
typedef struct PersonaE * PersonaP;

//Constructores
PersonaP crearPersona(int d, char n[15]);

//Destructor
void eliminarPersona(PersonaP p);

//Mostrar
void mostrarPersona(PersonaP p);

//Wrapper
void wrapperPersona(void * dato);

//Comparacion Char
int compararPersona(void * dato1, void * dato2);

#endif // PERSONA_H_INCLUDED


