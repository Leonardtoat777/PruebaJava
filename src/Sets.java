
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leona
 */
public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Victoria");
        
        System.out.println("Elementos del Set");
        conjunto.forEach(System.out::println);
        
        //remover elementos
        conjunto.remove("Karla");
        System.out.println("\nNuevo Elementos del Set");
        conjunto.forEach(System.out::println);
                
                
                
    
    }
            
}
