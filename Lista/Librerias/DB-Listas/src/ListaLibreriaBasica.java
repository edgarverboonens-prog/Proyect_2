import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaLibreriaBasica extends ADTLibDB {

    private List<Integer> elementos;

    public ListaLibreriaBasica() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public void mostrar() {
        if (elementos.isEmpty()) {
            System.out.println("Lista vacia.");
            return;
        }
        System.out.print("Lista: ");
        for (Integer num : elementos) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    @Override
    public boolean insertarOrdenado(int numero) {
        elementos.add(numero);
        Collections.sort(elementos);
        return true;
    }

    @Override
    public boolean eliminarPorValor(int numero) {
        if (elementos.isEmpty()) return false;
        return elementos.remove(Integer.valueOf(numero));
    }

    @Override
    public boolean estaVacia() {
        if (getTamActual() == 0) {
            System.out.println("Esta vacia la lista.");
        } else {
            System.out.println("No esta vacia tiene guardados: " + getTamActual());
        }
        return elementos.isEmpty();
    }

    @Override
    public int getTamActual() {
        return elementos.size();
    }
}