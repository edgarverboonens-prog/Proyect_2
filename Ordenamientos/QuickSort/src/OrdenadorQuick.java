public class OrdenadorQuick extends ADTOrdenadorNTD {


    @Override
    public void ordenarPorEdad(Persona[] array) {

        if (array == null || array.length == 0) {
            return;
        }
        quickSortRecursivo(array, 0, array.length - 1);
    }

    private void quickSortRecursivo(Persona[] array, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(array, inicio, fin);
            quickSortRecursivo(array, inicio, indicePivote - 1);
            quickSortRecursivo(array, indicePivote + 1, fin);
        }
    }
    private int particion(Persona[] array, int inicio, int fin) {
        int edadPivote = array[fin].edad;
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (array[j].edad <= edadPivote) {
                i++;
                Persona temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        Persona temp2 = array[i + 1];
        array[i + 1] = array[fin];
        array[fin] = temp2;

        return i + 1;
    }
}