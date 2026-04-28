#include <iostream>
#include "ListaDinamica.h"

using namespace std;

int main() {
    ListaDinamica miLista;
    int op;

    do {
        cout << "<=== Menu ===>" << endl;
        cout << "1. Agregar elemento" << endl;
        cout << "2. Eliminar elemento por valor" << endl;
        cout << "3. Mostrar contenido" << endl;
        cout << "4. Esta la lista vacia?" << endl;
        cout << "5. Salir" << endl;
        cout << "Elige una opcion: ";
        cin >> op;

        switch (op) {
            case 1: {
                cout << "Cuantos valores deseas meter? (No hay limite de memoria) ";
                int cantidadAInsertar;
                cin >> cantidadAInsertar;

                if (cantidadAInsertar > 0) {
                    cout << "===== METER VALORES =====" << endl;
                    for (int i = 0; i < cantidadAInsertar; i++) {
                        cout << "\n--- Ingreso " << (i + 1) << " ---" << endl;
                        cout << "Ingresa un numero entero: ";
                        int num;
                        cin >> num;

                        if (miLista.insertarOrdenado(num)) {
                            cout << "Se ingreso correctamente el numero." << endl;
                        }
                    }
                } else {
                    cout << "Cantidad no valida." << endl;
                }
                break;
            }
            case 2: {
                if (miLista.estaVacia()) {
                    cout << "No se puede eliminar nada, la lista esta vacia." << endl;
                    break;
                }
                
                cout << "\n===== ELIMINAR POR VALOR =====" << endl;
                cout << "Que numero deseas eliminar de la lista? ";
                int numEliminar;
                cin >> numEliminar;

                if (miLista.eliminarPorValor(numEliminar)) {
                    cout << "El numero " << numEliminar << " ha sido eliminado y la memoria liberada." << endl;
                } else {
                    cout << "El numero " << numEliminar << " no se encuentra en la lista." << endl;
                }
                break;
            }
            case 3:
                cout << "\nMostrando lista..." << endl;
                miLista.mostrar();
                break;
            case 4:
                cout << "\n--- ESTADO DE VACIO ---" << endl;
                if (miLista.estaVacia()) {
                    cout << "La lista esta vacia." << endl;
                } else {
                    cout << "No esta vacia. Tiene guardados: " << miLista.getTamActual() << " elementos." << endl;
                }
                break;
            case 5:
                cout << "Saliendo del menu..." << endl;
                break;
            default:
                cout << "\nError: Opcion no valida. Intenta de nuevo." << endl;
                break;
        }
    } while (op != 5);

    return 0;
}