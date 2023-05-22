/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.secion05;

import java.util.Scanner;

/**
 *
 * @author Murillo
 */
public class Problemapropuesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio de compra por kilo de fresa: ");
        double precio = sc.nextDouble();

        double costoTotal = precio * 100;
        double ganancia = 0.4 * costoTotal;
        double costoConMerma = costoTotal * 0.95;
        double precioVenta = (costoConMerma + ganancia) / 100;

        System.out.println("El precio al que debe vender cada kilo de fresa es: " + precioVenta);
    }
}

