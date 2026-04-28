public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];
        personas[0] = new Persona("Carlos", 19);
        personas[1] = new Persona("Ana", 19);
        personas[2] = new Persona("Luis", 42);
        personas[3] = new Persona("Maria", 12);
        personas[4] = new Persona("Pedro", 25);

        System.out.println("===== antes del QUICK SORT =====");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());
        }

        ADTOrdenadorNTD ordenador = new OrdenadorQuick();

        System.out.println("\nProcesando algoritmo Quick Sort...");
        ordenador.ordenarPorEdad(personas);

        System.out.println("\n===== despues del QUICK SORT =====");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());
        }
    }
}