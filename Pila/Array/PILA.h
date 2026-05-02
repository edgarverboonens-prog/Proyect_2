#ifndef PILA_H
#define PILA_H

const int MAX = 100;

class Pila {
private:
    int datos[MAX];
    int tope;

public:
    Pila();

    bool estaVacia();
    bool estaLlena();

    void agregar(int v);     // Push
    int quitar();           // Pop
    void visualizar();      // Mostrar
    int obtenerTamano();
};

#endif
