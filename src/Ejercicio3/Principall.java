package Ejercicio3;

import java.util.Scanner;

public class Principall {

    public static int indiceCocheMBarato(Vehiculo coches[]) {
        float precio;
        int indice = 0;
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;

    }

    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculo, indiceBarato;

        System.out.print("Digite la cantidad de vehiculos: ");
        numeroVehiculo = consola.nextInt();

        //Creamos los objetos para coche
        Vehiculo coches[] = new Vehiculo[numeroVehiculo];

        for (int i = 0; i < coches.length; i++) {
            consola.nextLine();
            System.out.println("Digite las caracterisittcas del coche " + (i + 1) + ":");
            System.out.print("Introduzca marca: ");
            marca = consola.nextLine();
            System.out.print("Introduzca modelo: ");
            modelo = consola.nextLine();
            System.out.print("introduzca precio: ");
            precio = consola.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);

        }
        
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nel coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());

    }

}
