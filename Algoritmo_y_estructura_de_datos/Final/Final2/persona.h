#ifndef PERSONA_H_INCLUDED
#define PERSONA_H_INCLUDED

struct Persona;
typedef struct Persona * PersonaPtr;

PersonaPtr crearPersona(char nombre[15], int dni);

//getters
char* getNombre(PersonaPtr p);
int getDni(PersonaPtr p);

//setters
void setNombre(PersonaPtr p, char nuevoNombre[15]);
void setDni(PersonaPtr p, int nuevoDni);

void wrapperPersona(DatoPtr dato);
void mostrarPersona(PersonaPtr p);


#endif // PERSONA_H_INCLUDED
