/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class Main {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        Operacion op = new Operacion();
        
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1,n2);
        int multiplicacion= op.multiplicacion(n1, n2);
        int div = op.division(n1, n2);
        
        op.mostrarResultado(suma, resta, multiplicacion, div);
    }
}
