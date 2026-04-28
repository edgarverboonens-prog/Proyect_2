import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ADTArrayDB misNumeros = new ListaArrayBasica(7);
        int cantidadAInsertar;
        int op;

        do{
            System.out.println("<===Menu===>");
            System.out.println("1. Agregar elemento \n" +
                    "2. Eliminar elemento \n" +
                    "3. Mostrar contendio \n" +
                    "4. Esta la lista llena? \n" +
                    "5. Esta la lista vacia? \n" +
                    "6. Salir");
            op = lector.nextInt();

            switch (op){

                case 1:
                    int espaciosLibres = 7 - misNumeros.getTamActual();

                    if (espaciosLibres == 0) {
                        System.out.println("La lista ya se lleno, requieres elmiminar elementos antes \n");
                        break;
                    }
                    System.out.println("Cuantos valores deseas meter? (MAX 7)");
                    cantidadAInsertar = lector.nextInt();

                    if (cantidadAInsertar <= espaciosLibres && cantidadAInsertar > 0){
                        System.out.println("=====METER VALORES=====");
                        for (int i = 0; i < cantidadAInsertar; i++) {
                            System.out.println("\n--- Ingreso " + (i + 1) + " ---");
                            System.out.print("Ingresa un numero entero: ");
                            int num = lector.nextInt();
                            if (misNumeros.insertarOrdenado(num)) {
                                System.out.println("Se ingreso correctamente el numero");
                            } else {
                                System.out.println("La lista esta llena");
                            }
                        }
                    }else{
                        System.out.println("No se pueden guardar esa cantidad, solo tienes de espacio: " + espaciosLibres + " espacios.");
                    }
                    break;

                case 2:
                    if (misNumeros.getTamActual() == 0){
                        System.out.println("No se puede eliminar nada, no hay ningun elemento");
                    }else {
                        System.out.println("\n===== ELIMINAR POR VALOR =====");
                        System.out.print("¿Qué número deseas eliminar de la lista? ");
                        int numEliminar = lector.nextInt();

                        if (misNumeros.eliminarPorValor(numEliminar)) {
                            System.out.println("El numero " + numEliminar + " ha sido eliminado");
                        } else {
                            System.out.println("El numero " + numEliminar + " no se encuentra en la lista.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Mostrando lista... \n");
                    misNumeros.mostrar();
                    break;
                case 4:
                        misNumeros.llena();
                    break;
                case 5:
                        misNumeros.vacia();
                    break;
                case 6:
                    System.out.println("Saliendo del menu...");
                    break;
                default:
                    System.out.println("\nOpcion no valida, seleccionar las opciones que aparecen en el menu");
                    break;
            }
        } while (op != 6);

    }
}