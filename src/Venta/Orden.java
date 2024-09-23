/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venta;

/**
 *
 * @author leona
 */
public class Orden {
    //similar que el de la clase Producto
    private final int idOrden; //necesita iniciarse dentro del constructor
    private Producto[] productos; //arreglo de objetos de tipo Producto
    private int contadorProductos;  //la cantidad de productos que agregamos
    private static final int MAX_PRODUCTOS = 10; //constante hasta 10 -> limite
    private static int contadorOrdenes;//contar cuantas ordenes se crearon
    
    
    //inicializa en el metrodo constructor el arreglo
    //que las veces va contar 
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;//incrementamos el valor idOrden
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; 
        //creamos un arreglo con lo cual cuantos elementos fueron creados
    }
    
    //metodo que no retorna informacion
    public void agregarProducto(Producto producto) {
        //si la variable de contadorProductos es menor a de maximos de Productos
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            //el contador producto indica las veces que se crearon los productos
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos"
                    + Orden.MAX_PRODUCTOS);
        }
    }
    
    //suma de los precios 
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            var producto = this.productos[i]; //recuperar el valor en cierta posiucion
            total += producto.getPrecio(); 
            
        }
        return total;
    }
    
    
    
//    public void mostrarOrden(){
//        System.out.println("ID Orden: "+this.idOrden);
//        var totalOrden = this.calcularTotal();
//        System.out.println("\tTotal de la Orden: S/."+totalOrden);
//        System.out.println("\tProductos de la Orden: ");
//        for (int i = 0; i < this.contadorProductos; i++) {
//            System.out.println("\t\t"+this.productos[i]);
//        }
//    }
    
    //podemos usar un metodo creando mostrar orden o tambien....
    //toString
    
    @Override
    public String toString(){
        var resultado = "Id Ordem: " + this.idOrden + "\n";
        var totalOrden = this.calcularTotal();
        resultado += "\tTotal de la orden: S/."+totalOrden + "\n";
        resultado += "\tProductos de la Orden: "+"\n";
        for (int i = 0; i < this.contadorProductos; i++) {
            resultado += "\t\t" + this.productos[i] + "\n";
            
        }
        return resultado;
    }
    
    
    

}
