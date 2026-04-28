package Libreria.LibreriaNuevoDato;

public class ColaLibreriaND_Concreta extends  ColaLibreriaND_Abstracta{

    public ColaLibreriaND_Concreta(int capacidad){
        super(capacidad);
    }

    @Override
    public void agregar(Producto p) {
        if (estaLlena()) {
            System.out.println("La cola está llena.");
        } else {
            datos.add(p);
        }
    }

    @Override
    public void quitar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Eliminado: " + datos.remove(0));
        }
    }

    @Override
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Vacía");
        } else {
            for (Producto p : datos) {
                System.out.println(p);
            }
        }
    }

    @Override
    public boolean estaVacia() {
        return datos.isEmpty();
    }

    @Override
    public boolean estaLlena() {
        return datos.size() == capacidad;
    }

    @Override
    public int tamaño() {
        return datos.size();
    }
}


