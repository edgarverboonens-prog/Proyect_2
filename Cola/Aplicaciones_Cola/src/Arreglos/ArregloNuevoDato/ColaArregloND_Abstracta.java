package Arreglos.ArregloNuevoDato;

public abstract class ColaArregloND_Abstracta {
    protected Producto[] datos;
    protected int frente;
    protected int fin;
    protected int capacidad;
    protected int cantidad;

    public ColaArregloND_Abstracta(int capacidad) {
        this.capacidad = capacidad;
        this.datos = new Producto[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.cantidad = 0;
    }

    public abstract void agregar(Producto p);
    public abstract void quitar();
    public abstract void mostrar();
    public abstract boolean estaVacia();
    public abstract boolean estaLlena();
    public abstract int tamanio();

}
