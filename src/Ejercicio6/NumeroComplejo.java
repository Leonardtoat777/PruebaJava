package Ejercicio6;

public class NumeroComplejo {

    private double real;
    private double imaginario;
    private double nuevoReal;
    private double nuevoImaginario;

    public NumeroComplejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    //suma de dos complejos (metodo para volver a llamar de la clase creada)
    public NumeroComplejo suma(NumeroComplejo other) {
        nuevoReal = this.real + other.real;
        nuevoImaginario = this.imaginario + other.imaginario;
        return new NumeroComplejo(nuevoReal, nuevoImaginario);
    }

    public NumeroComplejo multi(NumeroComplejo other) {
        nuevoReal = this.real * other.real - this.imaginario * other.imaginario;
        nuevoImaginario = this.real * other.imaginario + this.imaginario * other.real;
        return new NumeroComplejo(nuevoReal, nuevoImaginario);
    }

    public NumeroComplejo comparar(NumeroComplejo other) {
        boolean valor = false;
        if (this.real == other.real && this.imaginario == other.imaginario) {
            valor = true;
            System.out.println("Son iguales"+valor);
        } else {
            System.out.println("no son igualees"+valor);
        }
        return new NumeroComplejo(nuevoReal, nuevoImaginario);
    }


    public NumeroComplejo multiplyByInteger(int value) {
        double newReal = this.real * value;
        double newImaginary = this.imaginario * value;
        return new NumeroComplejo(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginario + "i";
    }

}
