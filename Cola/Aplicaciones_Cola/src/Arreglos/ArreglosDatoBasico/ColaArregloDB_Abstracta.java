package Arreglos.ArreglosDatoBasico;

public abstract class ColaArregloDB_Abstracta {

    protected int[] datos;
    protected int frente;
    protected int fin;
    protected int capacidad;
    protected int cantidad;

   public ColaArregloDB_Abstracta(int capacidad){
       this.cantidad = capacidad;
       this.datos = new int[capacidad];
       this.frente = 0;
       this.fin = -1;
       this.cantidad = 0;
   }
   public abstract void agregar(int valor);
   public abstract void quitar();
   public abstract void mostrar();
   public abstract boolean estaVacia();
   public abstract boolean estaLlena();
   public abstract int tamanio();
}
