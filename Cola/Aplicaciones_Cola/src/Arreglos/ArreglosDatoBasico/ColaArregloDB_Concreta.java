package Arreglos.ArreglosDatoBasico;

public class ColaArregloDB_Concreta extends ColaArregloDB_Abstracta {
    public ColaArregloDB_Concreta(int capacidad) {
        super(capacidad);
    }

    @Override
    public void agregar(int valor) {
        if(estaLlena()){
            System.out.println("La cola esta llena");
        }else {
            fin=(fin+1)%capacidad;
            datos[fin]=valor;
            cantidad++;
        }
    }

    @Override
    public void quitar() {
        if(estaVacia()){
            System.out.println("La cola esta vacia");
        }
       else{ frente=(frente+1)%capacidad;
        cantidad--;
    }
    }

    @Override
    public void mostrar() {
        if(estaVacia()){
            System.out.println("Vacio");
        }else {
            int i = frente;
            for (int c=0;c<cantidad;c++){
                System.out.println(datos[i]+" ");
                i=(i+1)%capacidad;
            }
            System.out.println();
        }

    }

    @Override
    public boolean estaVacia() {
        return cantidad==0;
    }

    @Override
    public boolean estaLlena() {
        return cantidad==capacidad;
    }

    @Override
    public int tamanio() {
        return cantidad;
    }


}
