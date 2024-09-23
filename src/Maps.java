
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        //compone de llave mayor
        Map<String,String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");
//        persona.put("edad", "31");
        System.out.println("Valores del mapa: ");
        
        //entrySet - no permite elementos duplicados
        persona.entrySet().forEach(System.out::println);
        persona.put("edad", "35");
        persona.remove("apellido");
        
        System.out.println("\nNuevo Valores del mapa: ");
        
        persona.entrySet().forEach(System.out::println);
        
        //iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elemento (llave,valor)");
        persona.forEach((llave,valor)->{
        System.out.println("llave: "+llave + ",Valor: "+valor);
    });
        
    }
}

