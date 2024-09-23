/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movimiento;

import java.util.logging.Logger;

/**
 *
 * @author leona
 */
public class PosicionTablero {

    private int x;
    private int y;

    public PosicionTablero() {

    } 
    
    /*
    public PosicionTablero(int x, int y) {
        this.x = x;
        this.y = y;
    }*/

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void arriba() {
        if (y != 0) {
            y -= 1;
        }
    }

    public void abajo() {
        if (y != 10) {
            y += 1;
        }
    }

    public void izquierda() {
        if (x != 0) {
            x += 1;
        }
    }

    public void derecha() {
        if (x != 10) {
            x -= 1;
        }
    }

    public String Digitar() {
        return "Digita las cordenadas de inicion ";        
        
    }
    
}


