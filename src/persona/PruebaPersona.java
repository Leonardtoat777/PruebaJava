
package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos Persona ***");
        System.out.println("Varuavke estatico "+Persona.getContadorPersona());
        
        var objeto1 = new Persona("Layla", "Acosta");
        System.out.print(objeto1);
        System.out.println("valor estatico "+Persona.getContadorPersona());
         
        var objeto2 = new Persona("Yani", "Lapaz");
        System.out.print(objeto2);
        System.out.println("valor estatico "+Persona.getContadorPersona());
        
    }

}
