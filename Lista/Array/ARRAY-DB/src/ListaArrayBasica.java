
public class ListaArrayBasica extends ADTArrayDB {
    private int[] elementos;
    private int tamActual;
    private final int MAX;

    public ListaArrayBasica(int capacidad) {
        this.MAX = capacidad;
        this.elementos = new int[MAX];
        this.tamActual = 0;
    }

    @Override
    public void mostrar() {
        if (tamActual == 0) {
            System.out.println("Lista vacia.");
            return;
        }
        System.out.print("Lista: ");
        for (int i = 0; i < tamActual; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean insertarOrdenado(int numero) {
        if (tamActual >= MAX) return false;

        int pos = 0;
        while (pos < tamActual && elementos[pos] < numero) {
            pos++;
        }
        for (int i = tamActual; i > pos; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[pos] = numero;
        tamActual++;
        return true;
    }

    @Override
    public boolean eliminarPorValor(int numero) {
        if (tamActual == 0) return false;

        int posEncontrada = -1;
        for (int i = 0; i < tamActual; i++) {
            if (elementos[i] == numero) {
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
        tamActual--;
        return true;
    }

    @Override
    public void llena() {
        if (tamActual == 7) {
            System.out.println("Esta llena la lista");
        } else {
            int disponibles = 7 - tamActual;
            System.out.println("No esta llena, espacios disponibles: " + disponibles);
        }
    }

    @Override
    public void vacia() {
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



