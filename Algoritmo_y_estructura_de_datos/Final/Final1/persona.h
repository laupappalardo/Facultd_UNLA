#ifndef PERSONA_H_INCLUDED
#define PERSONA_H_INCLUDED

struct Persona;
typedef struct Persona * PersonaPtr;

PersonaPtr crearPersona(char n[15], int dni);

//Getter
char* getNombre(PersonaPtr p);
int getDni(PersonaPtr p);

//Setter
void setNombre(PersonaPtr p, char n[15]);
void setDni(PersonaPtr p, int nuevoDni);

void wrapperPersona(void * dato);
void mostrarPersona(PersonaPtr p);


#endif // PERSONA_H_INCLUDED
