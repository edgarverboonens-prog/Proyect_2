import java.util.ArrayList;
import java.util.List;

public class ListaLibreria extends ADTLibNTD {
    private List<Persona> elementos;

    public ListaLibreria() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public void mostrar() {
        if (elementos.isEmpty()) {
            System.out.println("Lista vacia.");
            return;
        }
        System.out.println("Lista:");
        for (Persona p : elementos) {
            System.out.println(p.toString());
        }
        System.out.println();
    }

    @Override
    public boolean insertarOrdenado(Persona p) {
        elementos.add(p);
        elementos.sort((p1, p2) -> Integer.compare(p1.edad, p2.edad));
        return true;
    }

    @Override
    public boolean eliminarPorNombre(String nombre) {
        if (elementos.isEmpty()) return false;

        for (int i = 0; i < elementos.size(); i++) {
            if (elementos.get(i).nombre.equalsIgnoreCase(nombre)) {
                elementos.remove(i);
                return true;
            }
        }
        return false;
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