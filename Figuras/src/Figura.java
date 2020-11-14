/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Osmar Guerra
 */
public abstract class Figura {
    private String nombre, color;
    private int x,y;
    private float a,p;
    
    public abstract void dibujar();
    public Figura() {
    }

    public Figura(String nombre, String color, int x, int y) {
        this.nombre = nombre;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }


    public String toString() {
        return "Figura{" + "nombre=" + nombre + ", color=" + color + ", x=" + x + ", y=" + y + ", a=" + a + ", p=" + p + '}';
    }
    
    
    
}//class
