/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author leona
 */
public class Atletismo {
    private String numeroAtleta;
    private String nombre;
    private float tiempo;

    public Atletismo(String numeroAtleta, String nombre, float tiempo) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    
    public float getTiempo(){
        return tiempo;
    }
    
    public String mostrarDatos(){
        return "Numero Atleta: "+numeroAtleta+"\nNombre: "+nombre+"\nTiempo: S/."+tiempo+"\n";
    }
    
}
