package Arreglos.ArreglosDatoBasico;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la capacidad de la cola: ");
        int cap = sc.nextInt();

        ColaArregloDB_Concreta cola = new ColaArregloDB_Concreta(cap);

        int opcion;

        do {
            System.out.println("\n--- MENU COLA ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Quitar elemento");
            System.out.println("3. Mostrar contenido");
            System.out.println("4. Verificar si está vacía");
            System.out.println("5. Verificar si está llena");
            System.out.println("6. Mostrar tamaño");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese valor: ");
                    int valor = sc.nextInt();
                    cola.agregar(valor);
                    break;

                case 2:
                    cola.quitar();
                    break;

                case 3:
                    cola.mostrar();
                    break;

                case 4:
                    System.out.println(cola.estaVacia() ? "Está vacía" : "No está vacía");
                    break;

                case 5:
                    System.out.println(cola.estaLlena() ? "Está llena" : "No está llena");
                    break;

                case 6:
                    System.out.println("Tamaño: " + cola.tamanio());
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 7);

        sc.close();
    }
}








