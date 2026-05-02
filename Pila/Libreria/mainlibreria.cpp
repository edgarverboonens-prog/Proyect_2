#include <iostream>
#include "PilaLibreria.h"

using namespace std;

int main() {
    PilaLibreria p;
    int op, num;

    do {
        cout << "\n--- MENU PILA LIBRERIA ---" << endl;
        cout << "1. Agregar" << endl;
        cout << "2. Quitar" << endl;
        cout << "3. Mostrar" << endl;
        cout << "4. Salir" << endl;
        cout << "Opcion: ";
        cin >> op;

        switch(op) {
            case 1:
                cout << "Numero: ";
                cin >> num;
                p.agregar(num);
                break;

            case 2:
                num = p.quitar();
                if(num != -1)
                    cout << "Se elimino: " << num << endl;
                break;

            case 3:
                p.visualizar();
                break;

            case 4:
                cout << "Saliendo..." << endl;
                break;

            default:
                cout << "Opcion invalida." << endl;
        }

    } while(op != 4);

    return 0;
}
