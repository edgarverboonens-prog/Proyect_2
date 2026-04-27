package Libreria.LibreriaDB;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Ingresa la capacidad: ");
        int cap = sc.nextInt();
        ColaLibreriaDB_Concreta lib = new ColaLibreriaDB_Concreta(cap);

        int op;

        do {
            System.out.println("\n1.Agregar 2.Eliminar 3.Mostrar 4.Vacía 5.Llena 6.Tamaño 7.Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Valor: ");
                    lib.agregar(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Posición: ");
                    lib.eliminar(sc.nextInt());
                    break;
                case 3:
                    lib.mostrar();
                    break;
                case 4:
                    System.out.println(lib.estaVacia());
                    break;
                case 5:
                    System.out.println(lib.estaLlena());
                    break;
                case 6:
                    System.out.println(lib.tamanio());
                    break;
            }

        } while (op != 7);
    }
}