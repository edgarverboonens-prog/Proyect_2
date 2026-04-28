import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ADTListNTD misContactos = new ListaArray(5);
        int op;

        do {
            System.out.println("<===Menu===>");
            System.out.println("1. Agregar elemento \n" +
                    "2. Eliminar elemento \n" +
                    "3. Mostrar contendio \n" +
                    "4. Esta la lista llena? \n" +
                    "5. Esta la lista vacia? \n" +
                    "6. Salir");
            op = lector.nextInt();

            switch (op) {
                case 1:
                    opcionAgregar(lector, misContactos);
                    break;
                case 2:
                    opcionEliminar(lector, misContactos);
                    break;
                case 3:
                    System.out.println("\nMostrando lista... ");
                    misContactos.mostrar();
                    break;
                case 4:
                    misContactos.estaLlena();
                    break;
                case 5:
                    misContactos.estaVacia();
                    break;
                case 6:
                    System.out.println("Saliendo del menu...");
                    break;
                default:
                    System.out.println("\nOpcion no valida, selecciona una opcion del menu.");
                    break;
            }
        } while (op != 6);
    }





    private static void opcionAgregar(Scanner lector, ADTListNTD lista) {
        int espaciosLibres = 5 - lista.getTamActual();
        if (espaciosLibres == 0) {
            System.out.println("La lista ya se lleno, requieres eliminar elementos antes.");
            return;
        }
        System.out.println("Cuantas personas deseas registrar? (MAX 5)");
        int cantidadAInsertar = lector.nextInt();

        if (cantidadAInsertar <= espaciosLibres && cantidadAInsertar > 0) {
            System.out.println("===== REGISTRO DE PERSONAS =====");
            for (int i = 0; i < cantidadAInsertar; i++) {
                System.out.println("\n--- Persona " + (i + 1) + " ---");
                System.out.print("Nombre: ");
                String name = lector.next();
                System.out.print("Edad: ");
                int edad = lector.nextInt();

                Persona nueva = new Persona(name, edad);

                if (lista.meterValorPosicion(nueva)) {
                    System.out.println("Se registro correctamente.");
                }
            }
        } else {
            System.out.println("No se puede guardar esa cantidad, solo tienes " + espaciosLibres + " espacios.");
        }
    }

    private static void opcionEliminar(Scanner lector, ADTListNTD lista) {
        if (lista.getTamActual() == 0 ) {
            System.out.println("No se puede eliminar nada, no hay ninguna persona registrada.");
            return;
        }

        System.out.println("\n===== ELIMINAR POR NOMBRE =====");
        System.out.print("Que nombre deseas eliminar de la lista? ");
        String nombreEliminar = lector.next();

        if (lista.eliminaValorPosicion(nombreEliminar)) {
            System.out.println("El registro de " + nombreEliminar + " ha sido eliminado.");
        } else {
            System.out.println(nombreEliminar + " no se encuentra en la lista.");
        }
    }
}