/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author leona
 */
public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_Archivo.txt";
        try{
            //leer todas las lineas del archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("El contenido del archivo: ");
//            for(String linea: lineas){
//                System.out.println(linea);
//            
            lineas.forEach(System.out::println);

        }catch(Exception e){
            System.out.println("Error al leer archivo: "+e.getMessage());
            e.printStackTrace(); //para ver todo
        }
    }
}
