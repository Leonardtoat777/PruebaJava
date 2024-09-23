/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.File; //input-output
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {

    public static void main(String[] args) {
        var nombreArchivo = "mi_Archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            if (archivo.exists()) {
                System.out.println("El archivo ya existe!!");
            } else {
                //creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ah creadoe el archivo");
                }
            }catch (IOException e){
                System.out.println("Error al crear el archivo: "+e.getMessage());
        }
        
}
}

