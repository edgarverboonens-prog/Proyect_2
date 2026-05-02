#include <iostream>
#include "PILA.h"

using namespace std;

int main() {

    Pila p;
    int opcion, valor;

    do {
        cout << "\n--- MENU PILA ---" << endl;
        cout << "1. Agregar elemento" << endl;
        cout << "2. Quitar elemento" << endl;
        cout << "3. Mostrar pila" << endl;
        cout << "4. Verificar si esta vacia" << endl;
        cout << "5. Verificar si esta llena" << endl;
        cout << "6. Mostrar tamaño" << endl;
        cout << "7. Salir" << endl;
        cout << "Opcion: ";
        cin >> opcion;

        switch(opcion) {

        case 1:
            cout << "Numero: ";
            cin >> valor;
            p.agregar(valor);
            break;

        case 2:
            valor = p.quitar();
            if(valor != -1)
                cout << "Numero eliminado: " << valor << endl;
            break;

        case 3:
            p.visualizar();
            break;

        case 4:
            if(p.estaVacia())
                cout << "Si esta vacia." << endl;
            else
                cout << "No esta vacia." << endl;
            break;

        case 5:
            if(p.estaLlena())
                cout << "Si esta llena." << endl;
            else
                cout << "No esta llena." << endl;
            break;

        case 6:
            cout << "Tamaño: " << p.obtenerTamano() << endl;
            break;

        case 7:
            cout << "Fin del programa." << endl;
            break;

        default:
            cout << "Opcion incorrecta." << endl;
        }

    } while(opcion != 7);

    return 0;
}
