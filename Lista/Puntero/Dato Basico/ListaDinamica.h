#ifndef LISTADINAMICA_H
#define LISTADINAMICA_H
#include <iostream>

using namespace std;

class Nodo {
public:
    int dato;
    Nodo* siguiente;
};

class ListaDinamica {
private:
    Nodo* cabeza;
    int tamActual;

public:
    ListaDinamica();
    ~ListaDinamica();
    
    bool insertarOrdenado(int valor);
    bool eliminarPorValor(int valor);
    void mostrar();
    bool estaVacia();
    int getTamActual();
};

#endif