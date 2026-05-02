import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Cuantas personas deseas registrar en total?: ");
        int limite = lector.nextInt();

        Persona[] misContactos = new Persona[limite];
        int tamActual = 0;

        ADTOrdenadorNTD ordenador = new OrdenadorMerge();
        int op;

        do {
            System.out.println("\n<=== MENU MERGE SORT ===>");
            System.out.println("1. Agregar personas");
            System.out.println("2. Mostrar contenido de la lista");
            System.out.println("3. Aplicar ordenamiento por edad con Merge Sort");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            op = lector.nextInt();

            switch (op) {
                case 1:
                    if (tamActual == misContactos.length) {
                        System.out.println("\nLa lista esta llena Ya no caben mas personas.");
                        break;
                    }

                    while (tamActual < misContactos.length) {
                        System.out.println("\nRegistro [" + (tamActual + 1) + " de " + misContactos.length + "]");
                        System.out.print("Ingresa el nombre (sin espacios): ");
                        String nombre = lector.next();
                        System.out.print("Ingresa la edad: ");
                        int edad = lector.nextInt();

                        misContactos[tamActual] = new Persona(nombre, edad);
                        tamActual++;
                    }

                    System.out.println("\nHas llenado todos los espacios exitosamente");
                    break;

                case 2:
                    System.out.println("\n--- LISTA ACTUAL ---");
                    if (tamActual == 0) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        for (int i = 0; i < tamActual; i++) {
                            System.out.println(misContactos[i].toString());
                        }
                    }
                    break;

                case 3:
                    if (tamActual == 0) {
                        System.out.println("No hay nada que ordenar.");
                        break;
                    }
                    System.out.println("\nProcesando el algoritmo Merge Sort...");

                    ordenador.ordenarPorEdad(misContactos, tamActual);
                    System.out.println("Lista ordenada con exito, usa la opcion 2 para ver el resultado.");
                    break;

                case 4:
                    System.out.println("Saliendo del menu...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (op != 4);
    }
}