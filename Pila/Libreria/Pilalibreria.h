#ifndef PILALIBRERIA_H
#define PILALIBRERIA_H

#include <stack>
using namespace std;

class PilaLibreria {
private:
    stack<int> datos;

public:
    PilaLibreria();

    bool estaVacia();
    bool estaLlena();
    void agregar(int v);
    int quitar();
    void visualizar();
};

#endif
