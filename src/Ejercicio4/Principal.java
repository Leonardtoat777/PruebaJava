/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.Scanner;


public class Principal {
       public static int indiceAtletismo(Atletismo atleta[]) {
        float tiempo;
        int indice = 0;
        tiempo = atleta[0].getTiempo();
        for (int i = 1; i < atleta.length; i++) {
            if (atleta[i].getTiempo() < tiempo) {
                tiempo = atleta[i].getTiempo();
                indice = i;
            }
        }
        return indice;

    }
    
    
    public static void main(String[] args) {
        
        var consola = new Scanner (System.in);
        int serieAtleta, indice;
        String numeroAtleta, nombre;
        float tiempo;
        
        System.out.print("Digite la cantidad de participantes: ");
        serieAtleta = consola.nextInt();
        
        Atletismo atleta[] = new Atletismo[serieAtleta];
        
        for (int i = 0; i < atleta.length; i++) {
            consola.nextLine();
            System.out.println(" Datos del atleta "+(i+1)+":");
            System.out.println("DIgite numero de atleta: ");
            numeroAtleta = consola.nextLine();
            
            System.out.println("Digite nombre: ");
            nombre = consola.nextLine();
            
            System.out.println("Marcacion del tiempo: ");
            tiempo = consola.nextFloat();
            
            atleta[i] = new Atletismo(numeroAtleta,nombre,tiempo);
        }
        
        indice = indiceAtletismo(atleta);
        System.out.println("\nEl ganador es: ");
        System.out.println(atleta[indice].mostrarDatos());
    }
}
