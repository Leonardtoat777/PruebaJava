
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Listas {
    public static void main(String[] args) {
        /*
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        */
        
        List<String> miLista = new ArrayList<>();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
        /*
        for (String elemento: miLista) {
            System.out.println("Dia de la semana"+elemento);
        }
        */
        System.out.println("---------------------------------");
        //Funciones lambda (funcion anonima con poco codigo")
        //Programacion Funcional
        /*
        miLista.forEach(elemento -> {
            System.out.println("Elemento: "+elemento);
        });
        ¨*/
        
        //OTRA FDORMA DE SIMPLIFICAR
        miLista.forEach(System.out::println);
        
        List<String> nombres = Arrays.asList("Pedro","Ivonne","Nohemi");
        System.out.println("\nNombres: ");
        nombres.forEach(System.out::println);
        
    }
}
