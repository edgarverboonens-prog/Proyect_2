#include <iostream>
#include <stack>
#include "PilaLibreria.h"

using namespace std;

PilaLibreria::PilaLibreria() {
}

bool PilaLibreria::estaVacia() {
    return datos.empty();
}

bool PilaLibreria::estaLlena() {
    return false;
}

void PilaLibreria::agregar(int v) {
    datos.push(v);
    cout << "Numero agregado." << endl;
}

int PilaLibreria::quitar() {
    if (estaVacia()) {
        cout << "Pila vacia." << endl;
        return -1;
    }

    int aux = datos.top();
    datos.pop();
    return aux;
}

void PilaLibreria::visualizar() {
    if (estaVacia()) {
        cout << "Pila vacia." << endl;
        return;
    }

    stack<int> copia = datos;

    cout << "\nElementos de la pila:" << endl;

    while (!copia.empty()) {
        cout << copia.top() << endl;
        copia.pop();
    }
}
