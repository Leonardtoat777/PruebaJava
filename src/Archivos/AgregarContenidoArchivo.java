/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author leona
 */
public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false; //respetar lo que contienne y agregar informacion
        var nombreArchivo = "mi_Archivo.txt";
        var archivo  =  new File(nombreArchivo);
        try{
            //revisar si el archivo existe
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo,anexar));
            var nuevoContenido = "\nnuevo\ncontenido";
            salida.println(nuevoContenido);
            salida.close();
            System.out.println(" se agrego contenido al archivo...");
        }catch(Exception e){
            System.out.println("Error al escribir al archivo: "+e.getMessage());
            e.printStackTrace();
        }
        
    }
   
}   
