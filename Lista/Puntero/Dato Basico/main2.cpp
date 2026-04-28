#include <iostream>
#include "ListaDinamica.h"
using namespace std;

int main() {
    ListaDinamica miLista;

    miLista.insertar(10);
    miLista.insertar(20);
    miLista.insertar(30);

    cout << "Contenido de la Lista Dinamica: \n";
    miLista.mostrar();
    
    cout << "\n--- ELIMINANDO MANUALMENTE ---" << endl;
    miLista.eliminar(); // Sacamos el 30
    miLista.mostrar();  
    
    miLista.eliminar(); // Sacamos el 20
    miLista.mostrar();  

    return 0;
}