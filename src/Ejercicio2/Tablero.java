package Ejercicio2;

public class Tablero {

    //atributos 
    private int x;
    private int y;

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //movimiento 
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

    public void derecha() {
        if (x != 0) {
            x -= 1;
        }
    }

    public void izquierda() {
        if (x != 10) {
            x += 1;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}
