
package Maquiba_Snack_Archivo.Servicio;

import Maquiba_Snack_Archivo.Dominio.Snack;
import Maquina_Snack.*;
import java.util.List;
import java.util.ArrayList;

public class ServicioSnacksLista implements InterfazServicioSnacks {
    private static final List<Snack> snacks;
    
    //Bloque statico inicializado
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas",70));
        snacks.add(new Snack("Refresco",50));
        snacks.add(new Snack("Sandwich",120));
    }
  
    public  void agregarSnack(Snack snack){
        snacks.add(snack);
    }
      
    public void mostrarSnacks(){
        var inventarioSnacks = "";
        for( var snack: snacks){
            inventarioSnacks += snack.toString()+"\n";
        }
        System.out.println("-----Snacks en el inventario-----");
        System.out.println(inventarioSnacks);
    }
    
    public List<Snack> getSnacks(){
        return snacks;
    }
}
