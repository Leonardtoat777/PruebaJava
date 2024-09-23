/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {

    public static void main(String[] args) {
        //leer archivo
        var nombreArchivo = "mi_Archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            System.out.println("Contenido del archivo: ");
            //abrrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));

            //leeomos linea a linea
            var linea = entrada.readLine();

            //leemos todfas las lineas
            while (linea != null) {
                System.out.println(linea);
                //antes de terminar el ciclo, nos movemos a la siguiente linea
                linea = entrada.readLine();

            }
            //cerrar archivo
            entrada.close();
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }
}
