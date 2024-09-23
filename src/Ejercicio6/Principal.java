package Ejercicio6;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int numero,entero;
        double real, imaginario ;

        System.out.println("""
                           ***Bienvenido al menu Complejos***
                           Eliga una de estas opciones
                           1. Sumar dos numeros complejos
                           2. Multiplicar 2 numeros complejos
                           3. Comparar 2 numeros complejos (iguales o no)
                           4. Multiplicar un numero complejo por un entero
                           """);
        numero = consola.nextInt();

        System.out.print("digite complejo1: ");
        real = consola.nextDouble();

        System.out.print("Digite complejo2: ");
        imaginario = consola.nextDouble();

        NumeroComplejo c1 = new NumeroComplejo(real, imaginario);

        System.out.print("digite complejo1: ");
        real = consola.nextDouble();

        System.out.print("Digite complejo2: ");
        imaginario = consola.nextDouble();
        NumeroComplejo c2 = new NumeroComplejo(real, imaginario);

        switch (numero) {
            case 1:
                NumeroComplejo sumaP = c1.suma(c2);
                System.out.println("suma = " + sumaP);
                break;
            case 2:
                NumeroComplejo multiP = c1.multi(c2);
                System.out.println("multi = " + multiP);
                break;
            case 3:
                NumeroComplejo compararP = c1.comparar(c2);
                System.out.println("suma = " + compararP);
                break;
            case 4:
                System.out.println("Ingrese tambien entero: ");
                entero = consola.nextInt();
                
                NumeroComplejo sumaK = c1.suma(c2);
                System.out.println(sumaK);
                NumeroComplejo multiEntero = sumaK.multiplyByInteger(entero);
                System.out.println("La multiplicacion con entero es: "+multiEntero);
        }
    }
}
