package Libreria.LibreriaNuevoDato;

import java.util.ArrayList;

public abstract class ColaLibreriaND_Abstracta {

    protected ArrayList<Producto> datos;
    protected int capacidad;

    public ColaLibreriaND_Abstracta(int capacidad) {
        this.capacidad = capacidad;
        datos = new ArrayList<>();
    }

    public abstract void agregar(Producto p);
    public abstract void quitar();
    public abstract void mostrar();
    public abstract boolean estaVacia();
    public abstract boolean estaLlena();
    public abstract int tamaño();
}

