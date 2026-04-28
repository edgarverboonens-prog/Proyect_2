package Libreria.LibreriaNuevoDato;

public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String toString(){
        return nombre + " - $" + precio;
    }
}
