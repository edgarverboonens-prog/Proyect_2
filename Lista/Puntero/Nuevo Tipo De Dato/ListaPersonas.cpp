#include "ListaPersonas.h"

ListaPersonas::ListaPersonas() {
    cabeza = nullptr;
    tamActual = 0;
}
ListaPersonas::~ListaPersonas() {
    Nodo* actual = cabeza;
    while (actual != nullptr) {
        Nodo* siguiente = actual->siguiente;
        delete actual;
        actual = siguiente;
    }
    cout << "Toda la memoria de la lista ha sido liberada correctamente." << endl;
}

bool ListaPersonas::insertarOrdenado(string nom, int ed) {
    Nodo* nuevoNodo = new Nodo();
    nuevoNodo->dato.nombre = nom;
    nuevoNodo->dato.edad = ed;
    nuevoNodo->siguiente = nullptr;

    if (cabeza == nullptr || cabeza->dato.edad >= ed) {
        nuevoNodo->siguiente = cabeza;
        cabeza = nuevoNodo;
    } 

    else {
        Nodo* actual = cabeza;

        while (actual->siguiente != nullptr && actual->siguiente->dato.edad < ed) {
            actual = actual->siguiente;
        }
        nuevoNodo->siguiente = actual->siguiente;
        actual->siguiente = nuevoNodo;
    }
    tamActual++;
    return true;
}

bool ListaPersonas::eliminarPorNombre(string nom) {
    if (cabeza == nullptr) return false;
    if (cabeza->dato.nombre == nom) {
        Nodo* nodoABorrar = cabeza;
        cabeza = cabeza->siguiente;
        delete nodoABorrar;
        tamActual--;
        return true;
    }

    Nodo* actual = cabeza;
    while (actual->siguiente != nullptr && actual->siguiente->dato.nombre != nom) {
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

void ListaPersonas::mostrar() {
    if (cabeza == nullptr) {
        cout << "La lista esta vacia." << endl;
        return;
    }
    
    Nodo* actual = cabeza;
    cout << "Lista de Contactos:\n";
    while(actual != nullptr) {
        cout << "[Nombre: " << actual->dato.nombre << " | Edad: " << actual->dato.edad << "] -> ";
        actual = actual->siguiente;
    }
    cout << "NULL\n" << endl;
}

bool ListaPersonas::estaVacia() {
    return cabeza == nullptr;
}

int ListaPersonas::getTamActual() {
    return tamActual;
}