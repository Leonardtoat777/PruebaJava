
package Ejercicio5;

import java.util.Scanner;

public class Principal {
    
    public static double mayorArea(Triangulo_Isoceles triangulo[]){
        double area;
        
        area = triangulo[0].obtenerArea();
        for (int i = 1; i < triangulo.length; i++) {
            if (triangulo[i].obtenerArea()>area){
                area = triangulo[i].obtenerArea();
            }
        }
        return area;
    }
    
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        
        double base,lado;
        int nTriangulos;
        
        System.out.print("Digite numero de triangulos a ingresar: ");
        nTriangulos = consola.nextInt();
        
        //pedir la cantidad de numeros de triangulos almacenados en la clase trangulo_Isoceles
        //declarar un valor del objeto 
        Triangulo_Isoceles triangulo[] = new Triangulo_Isoceles[nTriangulos];
        
        for (int i = 0; i < triangulo.length; i++) {
            System.out.println("\nIndique los valores para el triangulo "+(i+1)+":");
            System.out.print("Introduzca la base: ");
            base = consola.nextDouble();
            System.out.print("Introduzca el lado: ");
            lado = consola.nextDouble();
            
            //almacena los datos creado de triangulo
            triangulo[i] = new Triangulo_Isoceles(base,lado);
            
            System.out.println("\nEl area del triangulo es: "+triangulo[i].obtenerArea());
            System.out.println("\nEl perimetro del triangulo es: "+triangulo[i].obtenerPerimetro());
            
        }
        System.out.println("\nEl area del triangulo de mayor superficie es: "+mayorArea(triangulo));
    }
}
