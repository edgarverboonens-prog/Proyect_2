package Arreglos.ArregloNuevoDato;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Ingresa la capacidad: ");

        int cap = sc.nextInt();
        sc.nextLine();

        ColaArregloND_Concreta cola = new ColaArregloND_Concreta(cap);

        int op;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Quitar producto");
            System.out.println("3. Mostrar");
            System.out.println("4. ¿Está vacía?");
            System.out.println("5. ¿Está llena?");
            System.out.println("6. Tamaño");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    cola.agregar(new Producto(nom, precio));
                    break;

                case 2:
                    cola.quitar();
                    break;

                case 3:
                    cola.mostrar();
                    break;

                case 4:
                    System.out.println(cola.estaVacia() ? "Sí" : "No");
                    break;

                case 5:
                    System.out.println(cola.estaLlena() ? "Sí" : "No");
                    break;

                case 6:
                    System.out.println("Tamaño: " + cola.tamanio());
                    break;

                case 7:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Error");
            }

        } while (op != 7);

        sc.close();
    }





    }


