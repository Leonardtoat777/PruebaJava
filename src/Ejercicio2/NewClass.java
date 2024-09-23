package Ejercicio2;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        Tablero c;
        int x, y;
        char tecla;
        System.out.print("Digita las cordenadas de inicion X ");
        x = consola.nextInt();
        System.out.println("Digite y ");
        y = consola.nextInt();

        c = new Tablero(x, y);
        do {

            System.out.println("ARRIBA = W\nABAJO = S\nDERECHA = A\nIZQUIERDA = D\nPOSICION ACTUAL = V\nSALIR = X\n\nDigita hacia donde quieres moverte: ");
            tecla = consola.next().charAt(0);
            switch (tecla) {
                case 'W':
                case 'w':
                    c.arriba();
                    System.out.println("ARRIBA");
                    System.out.println("x= " + c.getX() + " y= " + c.getY() + "\n");
                    break;

                case 'S':
                case 's':
                    c.abajo();
                    System.out.println("ABAJO");
                    System.out.println("x= " + c.getX() + " y= " + c.getY() + "\n");
                    break;

                case 'A':
                case 'a':
                    c.derecha();
                    System.out.println("DERECHA");
                    System.out.println("x= " + c.getX() + " y= " + c.getY() + "\n");
                    break;

                case 'D':
                case 'd':
                    c.izquierda();
                    System.out.println("IZQUIERDA");
                    System.out.println("x= " + c.getX() + " y= " + c.getY() + "\n");
                    break;

                case 'V':
                case 'v':
                    System.out.println("POSICION ACTUAL");
                    System.out.println("x= " + c.getX() + " y= " + c.getY() + "\n");
                    break;

                default:
                    System.out.println("Error: Accion no valida.\n\n");
            }

        } while (tecla != 'x');
    }
}
