public class ListaArray extends ADTListNTD {
    private Persona[] elementos;
    private int tamActual;
    private final int MAX;

    public ListaArray(int capacidad) {
        this.MAX = capacidad;
        this.elementos = new Persona[MAX];
        this.tamActual = 0;
    }

    @Override
    public void mostrar() {
        if (tamActual == 0) {
            System.out.println("Lista vacia.");
            return;
        }
        System.out.println("Lista de Contactos:");
        for (int i = 0; i < tamActual; i++) {
            System.out.println(elementos[i].toString());
        }
        System.out.println();
    }

    @Override
    public boolean meterValorPosicion(Persona p) {
        if (tamActual >= MAX) return false;
        int pos = 0;

        while (pos < tamActual && elementos[pos].edad < p.edad) {
            pos++;
        }
        for (int i = tamActual; i > pos; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[pos] = p;
        tamActual++;
        return true;
    }

    @Override
    public boolean eliminaValorPosicion(String nombreABuscar) {
        if (tamActual == 0) return false;

        int posEncontrada = -1;
        for (int i = 0; i < tamActual; i++) {
            if (elementos[i].nombre.equalsIgnoreCase(nombreABuscar)) {
                posEncontrada = i;
                break;
            }
        }

        if (posEncontrada == -1) {
            return false;
        }

        for (int i = posEncontrada; i < tamActual - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[tamActual - 1] = null;

        tamActual--;
        return true;
    }

    @Override
    public void estaLlena() {
        if (tamActual == 7) {
            System.out.println("Esta llena la lista");
        } else {
            int disponibles = 7 - tamActual;
            System.out.println("No esta llena, espacios disponibles: " + disponibles);
        }
    }

    @Override
    public void estaVacia() {
        if (tamActual == 0) {
            System.out.println("Esta vacia la lista");
        } else {
            System.out.println("El numero de datos guardados: " + tamActual);
        }
    }

    @Override
    public int getTamActual() {
        return tamActual;
    }
}