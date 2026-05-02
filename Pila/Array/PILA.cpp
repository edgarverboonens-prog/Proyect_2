#include <iostream>
#include "PILA.h"

using namespace std;

Pila::Pila() {
    tope = -1;
}

bool Pila::estaVacia() {
    return (tope == -1);
}

bool Pila::estaLlena() {
    return (tope == MAX - 1);
}

void Pila::agregar(int v) {
    if (estaLlena()) {
        cout << "Pila llena." << endl;
    } else {
        tope++;
        datos[tope] = v;
        cout << "Numero agregado." << endl;
    }
}

int Pila::quitar() {
    if (estaVacia()) {
        cout << "Pila vacia." << endl;
        return -1;
    } else {
        int aux = datos[tope];
        tope--;
        return aux;
    }
}

void Pila::visualizar() {
    if (estaVacia()) {
        cout << "Pila vacia." << endl;
    } else {
        cout << "Contenido de la pila:" << endl;
        for (int i = tope; i >= 0; i--) {
            cout << datos[i] << endl;
        }
    }
}

int Pila::obtenerTamano() {
    return tope + 1;
}
