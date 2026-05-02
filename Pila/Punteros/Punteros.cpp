#include <iostream>
#include "punteros.h"

using namespace std;

Pila::Pila(){
    tope = NULL;
}

bool Pila::estaVacia(){
    return tope == NULL;
}

void Pila::push(int valor){
    Nodo *nuevo = new Nodo();
    nuevo->dato = valor;
    nuevo->sig = tope;
    tope = nuevo;

    cout << "Elemento agregado.\n";
}

int Pila::pop(){
    if(estaVacia()){
        return -1;
    }

    Nodo *aux = tope;
    int valor = aux->dato;

    tope = tope->sig;
    delete aux;

    return valor;
}

void Pila::mostrar(){
    Nodo *aux = tope;

    cout << "Contenido de la pila:\n";

    while(aux != NULL){
        cout << aux->dato << endl;
        aux = aux->sig;
    }
}
