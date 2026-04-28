import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ADTLibDB misNumeros = new ListaLibreriaBasica();
        int op;

        do {
            System.out.println("<===Menu===>");
            System.out.println("1. Agregar elemento \n" +
                    "2. Eliminar elemento \n" +
                    "3. Mostrar contendio \n" +
                    "4. Esta la lista vacia? \n" +
                    "5. Salir");
            op = lector.nextInt();

            switch (op) {
                case 1:
                    System.out.println("¿Cuantos valores deseas meter? (no hay limite)");
                    int cantidadAInsertar = lector.nextInt();

                    if (cantidadAInsertar > 0) {
                        System.out.println("===== METER VALORES =====");
                        for (int i = 0; i < cantidadAInsertar; i++) {
                            System.out.println("\n--- Ingreso " + (i + 1) + " ---");
                            System.out.print("Ingresa un numero entero: ");
                            int num = lector.nextInt();

                            if (misNumeros.insertarOrdenado(num)) {
                                System.out.println("Se ingreso correctamente el numero.");
                            }
                        }
                    } else {
                        System.out.println("Cantidad no valida.");
                    }
                    break;
                case 2:
                    if (misNumeros.estaVacia()) {
                        System.out.println("No se puede eliminar nada, no hay ningun elemento.");
                        return;
                    }
                    System.out.println("\n===== ELIMINAR POR VALOR =====");
                    System.out.print("Que numero deseas eliminar de la lista? ");
                    int numEliminar = lector.nextInt();

                    if (misNumeros.eliminarPorValor(numEliminar)) {
                        System.out.println("El numero " + numEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El numero " + numEliminar + " no se encuentra en la lista.");
                    }
                    break;
                case 3:
                    System.out.println("\nMostrando lista...");
                    misNumeros.mostrar();
                    break;
                case 4:
                    misNumeros.estaVacia();
                    break;
                case 5:
                    System.out.println("Saliendo del menu...");
                    break;
                default:
                    System.out.println("\n El numero elegido no esta en el menu, favor de revisar el listado del menu");
                    break;
            }
        } while (op != 5);
    }
}