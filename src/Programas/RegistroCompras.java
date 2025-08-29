/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author JAVIER
 */
import java.util.Scanner;

public class RegistroCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese compra 1: ");
        double compra1 = sc.nextDouble();

        System.out.print("Ingrese compra 2: ");
        double compra2 = sc.nextDouble();

        System.out.print("Ingrese compra 3: ");
        double compra3 = sc.nextDouble();

        // Cálculos
        double totalCompras = compra1 + compra2 + compra3;
        double promedioCompras = totalCompras / 3;

        // Resultados
        System.out.println("\nRESULTADOS");
        System.out.println("Cliente              : " + nombre);
        System.out.println("Total compras        : " + totalCompras);
        System.out.println("Promedio compras     : " + promedioCompras);

        sc.close();
    }
}
