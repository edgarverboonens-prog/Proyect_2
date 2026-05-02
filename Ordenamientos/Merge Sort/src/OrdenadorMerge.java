public class OrdenadorMerge extends ADTOrdenadorNTD {

    @Override
    public void ordenarPorEdad(Persona[] array, int tamActual) {
        if (array == null || tamActual <= 1) {
            return;
        }
        Persona[] temp = new Persona[tamActual];
        mergeSort(array, temp, 0, tamActual - 1);
    }

    private void mergeSort(Persona[] array, Persona[] temp, int izq, int der) {
        if (izq < der) {
            int medio = izq + (der - izq) / 2;
            mergeSort(array, temp, izq, medio);
            mergeSort(array, temp, medio + 1, der);
            merge(array, temp, izq, medio, der);
        }
    }

    private void merge(Persona[] array, Persona[] temp, int izq, int medio, int der) {
        for (int i = izq; i <= der; i++) {
            temp[i] = array[i];
        }

        int i = izq;
        int j = medio + 1;
        int k = izq;

        while (i <= medio && j <= der) {
            if (temp[i].edad <= temp[j].edad) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= medio) {
            array[k] = temp[i];
            k++;
            i++;
        }
    }
}