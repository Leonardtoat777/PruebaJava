
package animal;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El Animal hace un sonido");
    }
}

class Perro extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace guau");
    }

}

class Gato extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El gato hace miau");
    }
}

class PruebaAnimal{
    
    //metodo poliformico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }
    
    public static void main(String[] args) {
        //objeto de la clase padre (animal)
        //var animal =  new Animal();
        //var animal =  new Perro();
        var animal =  new Gato();
        imprimirSonido(animal);
        
        
    }
}

