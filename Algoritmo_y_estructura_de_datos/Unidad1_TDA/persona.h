#ifndef PERSONA_H_INCLUDED
#define PERSONA_H_INCLUDED

struct PersonaE;
typedef struct PersonaE * PersonaP;

PersonaP crearPersona(char n[20], char ap[30], int dd, int a, int m, int d);
void mostrarPersona(PersonaP p);

void mostrarPersona(PersonaP p);

// Getters
char* getNombrePersona(PersonaP p);
char* getApellidoPersona(PersonaP p);
int getDniPersona(PersonaP p);

// Setters
void setNombrePersona(PersonaP p, char nombre[]);

void setApellidoPersona(PersonaP p, char ap[20]);

void setDniPersona(PersonaP p, int dd);


#endif // PERSONA_H_INCLUDED
