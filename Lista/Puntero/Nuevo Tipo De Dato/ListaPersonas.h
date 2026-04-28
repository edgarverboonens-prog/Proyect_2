#ifndef LISTAPERSONAS_H
#define LISTAPERSONAS_H
#include <iostream>
#include <string>
using namespace std;

struct Persona {
    string nombre;
    int edad;
};
class Nodo {
public:
    Persona dato;
    Nodo* siguiente;
};
class ListaPersonas {
private:
    Nodo* cabeza;
    int tamActual;
public:
    ListaPersonas();
    ~ListaPersonas();

    bool insertarOrdenado(string nom, int ed); 
    bool eliminarPorNombre(string nom);
    void mostrar();
    bool estaVacia();
    int getTamActual();
};

#endif