package Libreria.LibreriaNuevoDato;

import Libreria.LibreriaNuevoDato.ColaLibreriaND_Concreta;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Capacidad: ");
        int cap = sc.nextInt();
        sc.nextLine();

        ColaLibreriaND_Concreta cola = new ColaLibreriaND_Concreta(cap);

        int op;

        do {
            System.out.println("\n1. Agregar producto");
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
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    cola.agregar(new Producto(nombre, precio));
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
                    System.out.println("Tamaño: " + cola.tamaño());
                    break;
            }

        } while (op != 7);

        sc.close();
    }
}