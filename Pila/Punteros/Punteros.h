#ifndef PUNTEROS_H
#define PUNTEROS_H

class Nodo{
public:
    int dato;
    Nodo *sig;
};

class Pila{
private:
    Nodo *tope;

public:
    Pila();
    bool estaVacia();
    void push(int valor);
    int pop();
    void mostrar();
};

#endif
