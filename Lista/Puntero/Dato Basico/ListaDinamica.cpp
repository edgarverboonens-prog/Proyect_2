#include "ListaDinamica.h"

ListaDinamica::ListaDinamica() {
    cabeza = nullptr;
    tamActual = 0;
}
ListaDinamica::~ListaDinamica() {
    Nodo* actual = cabeza;
    while (actual != nullptr) {
        Nodo* siguiente = actual->siguiente;
        delete actual;
        actual = siguiente;
    }
    cout << "Memoria RAM liberada correctamente al cerrar el programa." << endl;
}

bool ListaDinamica::insertarOrdenado(int valor) {
    Nodo* nuevoNodo = new Nodo();
    nuevoNodo->dato = valor;
    nuevoNodo->siguiente = nullptr;
    if (cabeza == nullptr || cabeza->dato >= valor) {
        nuevoNodo->siguiente = cabeza;
        cabeza = nuevoNodo;
    } 
    else {
        Nodo* actual = cabeza;
        while (actual->siguiente != nullptr && actual->siguiente->dato < valor) {
            actual = actual->siguiente;
        }
        nuevoNodo->siguiente = actual->siguiente;
        actual->siguiente = nuevoNodo;
    }
    
    tamActual++;
    return true;
}

bool ListaDinamica::eliminarPorValor(int valor) {
    if (cabeza == nullptr) return false;

    if (cabeza->dato == valor) {
        Nodo* nodoABorrar = cabeza;
        cabeza = cabeza->siguiente;
        delete nodoABorrar;
        tamActual--;
        return true;
    }

    Nodo* actual = cabeza;

    while (actual->siguiente != nullptr && actual->siguiente->dato != valor) {
        actual = actual->siguiente;
    }

    if (actual->siguiente != nullptr) {
        Nodo* nodoABorrar = actual->siguiente;
        actual->siguiente = nodoABorrar->siguiente;
        delete nodoABorrar;
        tamActual--;
        return true;
    }

    return false;
}

void ListaDinamica::mostrar() {
    if (cabeza == nullptr) {
        cout << "Lista vacia." << endl;
        return;
    }
    
    Nodo* actual = cabeza;
    cout << "Lista: ";
    while (actual != nullptr) {
        cout << "[" << actual->dato << "] -> ";
        actual = actual->siguiente;
    }
    cout << "NULL\n" << endl;
}

bool ListaDinamica::estaVacia() {
    return cabeza == nullptr;
}

int ListaDinamica::getTamActual() {
    return tamActual;
}