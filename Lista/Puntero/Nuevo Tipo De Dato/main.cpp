#include <iostream>
#include <string>
#include "ListaPersonas.h"
using namespace std;

int main() {
    ListaPersonas miLista;
    int op;

    do {
        cout << "\n<=== Menu ===>" << endl;
        cout << "1. Agregar persona" << endl;
        cout << "2. Eliminar persona por nombre" << endl;
        cout << "3. Mostrar contenido" << endl;
        cout << "4. Esta la lista vacia?" << endl;
        cout << "5. Salir" << endl;
        cout << "Elige una opcion: ";
        cin >> op;

        switch (op) {
            case 1: {
                cout << "Cuantas personas deseas registrar? (No hay limite de memoria)";
                int cantidad;
                cin >> cantidad;

                if (cantidad > 0) {
                    cout << "===== REGISTRO =====" << endl;
                    for (int i = 0; i < cantidad; i++) {
                        string nombre;
                        int edad;
                        cout << "\n--- Persona " << (i + 1) << " ---" << endl;
                        cout << "Nombre (sin espacios): ";
                        cin >> nombre;
                        cout << "Edad: ";
                        cin >> edad;

                        if (miLista.insertarOrdenado(nombre, edad)) {
                            cout << "Se registro correctamente a la persona" << endl;
                        }
                    }
                }
                break;
            }
            case 2: {
                if (miLista.estaVacia()) {
                    cout << "No hay ninguna persona registrada." << endl;
                    break;
                }
                
                cout << "\n===== ELIMINAR POR NOMBRE =====" << endl;
                cout << "Que nombre deseas eliminar? (Respeta mayusculas)";
                string nombreEliminar;
                cin >> nombreEliminar;

                if (miLista.eliminarPorNombre(nombreEliminar)) {
                    cout << "El registro de " << nombreEliminar << " ha sido eliminado." << endl;
                } else {
                    cout << "El nombre " << nombreEliminar << " no se encuentra." << endl;
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
                    cout << "La lista esta completamente vacia." << endl;
                } else {
                    cout << "No esta vacia, tiene guardados: " << miLista.getTamActual() << " registros." << endl;
                }
                break;
            case 5:
                cout << "Saliendo del programa..." << endl;
                break;
            default:
                cout << "\nError: Opcion no valida." << endl;
                break;
        }
    } while (op != 5);

    return 0;
}