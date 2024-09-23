/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leona
 */
public class Matematica {
    public static void main(String[] args) {
        int x; double rand, y,z;
        float max;
        
        rand = Math.random();
        x=Math.abs(-123);
        y=Math.round(123.567);
        z=Math.pow(2, 4);
        
        max=Math.max((float)1e10, (float)3e9);
        System.out.println("El valor de rand es: "+rand);
        System.out.println("El valor de x es: "+x);
        System.out.println("El valor de y es: "+y);
        System.out.println("El valor de z es: "+z);
        System.out.println("El valor de max es: "+max);
    }
}
