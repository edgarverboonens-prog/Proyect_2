package Libreria.LibreriaDB;

public class ColaLibreriaDB_Concreta extends ColaLibreriaDB_Abstracta{
    public ColaLibreriaDB_Concreta(int capacidad){
        super(capacidad);
    }

    @Override
    public void agregar(int valor) {
        if (estaLlena()) {
            System.out.println("Lleno");
        } else {
            datos[cantidad] = valor;
            cantidad++;
        }
    }

    @Override
    public void eliminar(int posicion) {
        if (estaVacia()) {
            System.out.println("Vacío");
        } else if (posicion < 0 || posicion >= cantidad) {
            System.out.println("Posición inválida");
        } else {
            for (int i = posicion; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1];
            }
            cantidad--;
        }
    }

    @Override
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Vacío");
        } else {
            for (int i = 0; i < cantidad; i++) {
                System.out.print(datos[i] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean estaVacia() {
        return cantidad == 0;
    }

    @Override
    public boolean estaLlena() {
        return cantidad == capacidad;
    }

    @Override
    public int tamanio() {
        return cantidad;
    }
}