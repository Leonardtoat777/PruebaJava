
package Venta;

public class Producto {
    //atributos
    //se debe crear dentro del metodo constructor inicializar el valor constante
    private final int idProducto; 
    private String nombre;
    private double precio;
    private static int contadorProductos; ///variable estatica
    //encargado de asignar un valor unico al idProducto
    //cada vez que se use, se inicializa el idProducto
    
    //metodo constructor con argumentos
    public Producto (String nombre, double precio){
        /*inicializamos el valor idProducto,luego
        para buenas practicas, llamamos el atributo statico
        dentro de esta clase ++Productos.contadorProductos
        */
        this.idProducto = ++Producto.contadorProductos; //incrementa
        //por lo tanto el idProducto cada vez que se crea, aumenta un valor
        this.nombre = nombre; //inicilizamos nombre y precio
        this.precio = precio;
    }
    
    //se crea tambien el idProducto para que sea de solo lectura
    public int getIdProducto(){
        return this.idProducto;
    }

    //se crea gett y set de los atributos ecepto el static
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    //creamos el metodo toString para mostrrar datos del valor creado
    //este caso, llamar el valor creado producto1, producto2
    @Override
    public String toString() {
        return "Producto{" + 
                "idProducto=" + this.idProducto + 
                ", nombre='" + this.nombre + "\'"+
                ", precio=" + this.precio + '}';
    }

    
    
}
