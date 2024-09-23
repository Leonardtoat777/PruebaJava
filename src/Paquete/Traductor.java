
package Paquete;

public interface Traductor {
    //Public y abstract
    void traducir();
    
    //Metodos con implemetacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}


class Ingles implements Traductor{
    @Override  //implementando el comportamiento
    public void traducir(){
        System.out.println("traduzco a ingles");
    }
}

class Frances implements Traductor{
    public void traductor(){
        System.out.println("Traduciendo a Frances...");
    }

    @Override
    public void traducir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void iniciarTraductor() {
        Traductor.super.iniciarTraductor(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles  = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
    }
}
