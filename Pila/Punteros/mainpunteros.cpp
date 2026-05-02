#include <iostream>
#include "punteros.h"

using namespace std;

int main(){
    Pila p;
    int op, valor;

    do{
        cout << "\n--- PILA CON PUNTEROS ---\n";
        cout << "1. Push\n";
        cout << "2. Pop\n";
        cout << "3. Mostrar\n";
        cout << "4. Verificar vacia\n";
        cout << "5. Salir\n";
        cout << "Opcion: ";
        cin >> op;

        switch(op){
            case 1:
                cout << "Numero: ";
                cin >> valor;
                p.push(valor);
                break;

            case 2:
                valor = p.pop();

                if(valor == -1)
                    cout << "Pila vacia.\n";
                else
                    cout << "Elemento eliminado: " << valor << endl;
                break;

            case 3:
                p.mostrar();
                break;

            case 4:
                if(p.estaVacia())
                    cout << "Si esta vacia.\n";
                else
                    cout << "No esta vacia.\n";
                break;

            case 5:
                cout << "Fin.\n";
                break;

            default:
                cout << "Opcion incorrecta.\n";
        }

    }while(op != 5);

    return 0;
}
