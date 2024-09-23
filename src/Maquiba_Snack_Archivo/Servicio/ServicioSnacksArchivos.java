
package Maquiba_Snack_Archivo.Servicio;

import Maquiba_Snack_Archivo.Dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class ServicioSnacksArchivos implements InterfazServicioSnacks{

    private final String NOMBRE_ARCHIVO = "snacks.txt";
    
    //creamos la lista de snacks
    private List<Snack> snacks = new ArrayList<>();
    
    //constructor clase

    public ServicioSnacksArchivos() {
        //creamos el archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try{
            existe = archivo.exists();
            if(existe){
               //this.snacks = obtenerSnack();
            }
            else{
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ah creado el archivo ");
            }
        }catch(Exception e){
            System.out.println("Error al crear el archivo"+e.getMessage());
        }
        
        if(!existe){
           cargarSnacksIniciales();
        }
    }
    
    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Papas",70));
        this.agregarSnack(new Snack("Refresco",50));
        this.agregarSnack(new Snack("Sandwich",120));
    }
    
    @Override
    public void agregarSnack(Snack snack) {
        //agregamos el nuevo snack a la lista
        //1.Se guarda en la lista de memoria
        this.snacks.add(snack);
        
        //2. Guardamos el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);
    }
    
    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo,anexar)); //si se anexa o se sobrescribe
            salida.println(snack);
            salida.close();//se escribe la informacion en el archivo
        }catch(Exception e){
            System.out.println("Error al agregar snack: "+e.getMessage());
        }
    }
    
    //-----------------------------------------------------------------------------------------------------
    
    
    @Override
    public void mostrarSnacks() {
        
    }

    @Override
    public List<Snack> getSnacks() {
        return null;
    }
    
}
