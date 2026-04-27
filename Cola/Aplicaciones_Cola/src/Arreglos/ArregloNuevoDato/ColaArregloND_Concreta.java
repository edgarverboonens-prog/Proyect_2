package Arreglos.ArregloNuevoDato;

public class ColaArregloND_Concreta extends ColaArregloND_Abstracta{
    public ColaArregloND_Concreta(int capacidad) {
        super(capacidad);
    }

    @Override
    public void agregar(Producto p) {
        if (estaLlena()) {
            System.out.println("La cola está llena.");
        } else {
            fin = (fin + 1) % capacidad;
            datos[fin] = p;
            cantidad++;
        }
    }

    @Override
    public void quitar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Eliminado: " + datos[frente]);
            frente = (frente + 1) % capacidad;
            cantidad--;
        }
    }

    @Override
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Vacía");
        } else {
            int i = frente;
            for (int c = 0; c < cantidad; c++) {
                System.out.println(datos[i]);
                i = (i + 1) % capacidad;
            }
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
