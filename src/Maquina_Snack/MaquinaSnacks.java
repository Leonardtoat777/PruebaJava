/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maquina_Snack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author leona
 */
public class MaquinaSnacks {

    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        var salir = false;
        var consola = new Scanner(System.in);
        //Creamos la lista de productos de tipo sanck 
        List<Snack> productos = new ArrayList();
        System.out.println("**** Maquina de SnackS ****");
        Snacks.mostrarSnacks(); // mostrar inventario snacks 
        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos); //se desbloquea ultimo
            } catch (Exception e) {
                System.err.println("Ocurrio un error: " + e.getMessage());
            } finally {
                System.out.println();//salto de linea
            }
        }

    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                           Menu: 
                           1.Comprar Snack
                           2.Mostrar Ticket
                           3.Agregar Nuevo Sanck
                           4.Salir
                           Elige una opcion:\s
                           """);
        //leemos y retornamos la opcion seleccionda
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion,
            Scanner consola, List<Snack> producto) {
        var salir = false;
        switch (opcion) {
            case 1 ->
                comprarSanck(consola, producto);
            case 2 ->
                mostrarTicket(producto);
            case 3 ->
                agregarSnack(consola);
            case 4 -> {
                System.out.println("regresa pronto"); 
                salir = true;
            }
            default -> System.out.println("Opcion invalida: "+opcion );
        
        }
        return salir;

    }

    private static void comprarSanck(Scanner consola,
            List<Snack> productos) {
        System.out.print("Que snack quieres comprar (id)?");
        var idSnack = Integer.parseInt(consola.nextLine());
        //validar que el snack exista en la lista de snacks
        var snackEncontrado = false;
        for (var snack : Snacks.getSnacks()) {
            if (idSnack == snack.getIdSnack()) {
                //agregamos el sanck a la lista de productos
                productos.add(snack);
                System.out.println("Ok, Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }

        }
        if (!snackEncontrado) {
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos) {
        var ticket = "*** Ticket de venta ***";
        var total = 0.0;
        for (var producto : productos) {
            ticket += "\n\t-" + producto.getNombre() + " - S/." + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> S/." + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola) {
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu, snack se ha agregado correctamente");
        Snacks.mostrarSnacks();
    }
}
