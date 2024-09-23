/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movimiento;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Main {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        //int x=0, y=0;
        PosicionTablero pt = new PosicionTablero();
        
        var tecla='0';
        
        System.out.print(pt.Digitar() + ":X ");
        pt.setX(consola.nextInt());
        //x = consola.nextInt();

        System.out.print(pt.Digitar() + ":Y ");
        pt.setY(consola.nextInt());
        //y = consola.nextInt();

       // pt = PosicionTablero(x,y);
        while (tecla != 'x' || tecla != 'X') {
            
            System.out.print("""
                           \nARRIBA CON BOTON 'W',
                           ABAJO CON BOTON 'S',
                           DERECHA CON BOTON 'D',
                           IZQUIERDA CON BOTON 'A'
                           
                           ELEGIR BOTON: 
                           """);
            tecla = consola.next().charAt(0);
            switch (tecla) {
                case 'w', 'W':
                    pt.arriba();
                    System.out.println("Arriba: x = " + pt.getX() + " y = " + pt.getY() + "\n");
                    break;
                case 's', 'S':
                    pt.abajo();
                    System.out.println("Abajo: x = " + pt.getX() + " y = " + pt.getY() + "\n");
                    break;
                case 'a', 'A':
                    pt.izquierda();
                    System.out.println("Izquierda: x = " + pt.getX() + " y = " + pt.getY() + "\n");
                    break;
                case 'd', 'D':
                    pt.arriba();
                    System.out.println("Arriba: x = " + pt.getX() + " y = " + pt.getY() + "\n");
                    break;
                default:
                    System.out.println("Tecla no valida,");
            }

        }
    }

    
}
