/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venta;

/**
 *
 * @author leona
 */
public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("***SISTEMA DE VENTAS***");
        
        
        //validar la conexion de la clase Producto creando valores
        var producto1 = new Producto("zapato",50.0);
        //System.out.println("producto1 = " + producto1);
        
        var producto2 = new Producto("jeans",100.0);
        //System.out.println("producto2 = " + producto2);
        
        //primer orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        //orden1.mostrarOrden();
        System.out.println(orden1);
        
        //Segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Playera",1500));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        System.out.println(orden2);
        
    }
}
