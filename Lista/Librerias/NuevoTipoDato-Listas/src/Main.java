import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ADTLibNTD misContactos = new ListaLibreria();
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
                    System.out.println("Cuantos valores deseas meter? (no hay limite)");
                    int cantidadAInsertar = lector.nextInt();

                    if (cantidadAInsertar > 0) {
                        System.out.println("===== METER VALORES =====");
                        for (int i = 0; i < cantidadAInsertar; i++) {
                            System.out.println("\n--- Ingreso " + (i + 1) + " ---");
                            System.out.print("Nombre: ");
                            String name = lector.next();
                            System.out.print("Edad: ");
                            int edad = lector.nextInt();

                            Persona nueva = new Persona(name, edad);

                            if (misContactos.insertarOrdenado(nueva)) {
                                System.out.println("Se ingreso correctamente a la persona.");
                            }
                        }
                    } else {
                        System.out.println("Cantidad no valida.");
                    }
                    break;
                case 2:
                    if (misContactos.getTamActual() == 0) {
                        System.out.println("No se puede eliminar nada, no hay ningun elemento.");
                        break;
                    }

                    System.out.println("\n===== ELIMINAR POR NOMBRE =====");
                    System.out.print("Que nombre deseas eliminar de la lista? ");
                    String nombreEliminar = lector.next();

                    if (misContactos.eliminarPorNombre(nombreEliminar)) {
                        System.out.println("El registro de " + nombreEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El nombre " + nombreEliminar + " no se encuentra en la lista.");
                    }
                    break;
                case 3:
                    System.out.println("\nMostrando lista...");
                    misContactos.mostrar();
                    break;
                case 4:
                    misContactos.estaVacia();
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