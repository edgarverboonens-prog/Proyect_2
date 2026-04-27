package Libreria.LibreriaDB;

public abstract class ColaLibreriaDB_Abstracta {
    protected int[] datos;
    protected int cantidad;
    protected int capacidad;

    public ColaLibreriaDB_Abstracta(int capacidad) {
        this.capacidad = capacidad;
        this.datos = new int[capacidad];
        this.cantidad = 0;
    }

    public abstract void agregar(int valor);
    public abstract void eliminar(int posicion);
    public abstract void mostrar();
    public abstract boolean estaVacia();
    public abstract boolean estaLlena();
    public abstract int tamanio();
}
