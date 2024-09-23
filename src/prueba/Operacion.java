/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class Operacion {
    //Atributos
    /*
    int suma;
    int resta;
    int multiplicacion;
    int division;
    */
    //metodo
    
    
    //suma de dos numeros
    public int sumar(int numero1,int numero2){
        int suma = numero1+numero2;
        return suma;
    }
    
    public int restar(int numero1,int numero2){
        int resta = numero1-numero2;
        return resta;
    }
    
    public int  multiplicacion(int numero1,int numero2){
        int multiplicacion = numero1*numero2;
        return multiplicacion;
    }
    
    public int  division(int numero1,int numero2){
        int div = numero1/numero2;
        return div;
    }
    
    public void mostrarResultado(int suma,int resta,int multiplicacion, int division){
        System.out.println("Suma es "+suma);
        System.out.println("Resta es "+resta);
        System.out.println("Multiplicacion es "+multiplicacion);
        System.out.println("division es "+division);
        
    }
           
           
}
