public class OrdenadorBurbuja extends ADTOrdenadorNTD {
    @Override
    public void ordenarPorEdad(Persona[] array, int tamActual) {
        if (array == null || tamActual <= 1) {
            return;
        }
        for (int i = 0; i < tamActual - 1; i++) {
            for (int j = 0; j < tamActual - 1 - i; j++) {
                if (array[j].edad > array[j + 1].edad) {
                    Persona temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}