
import java.awt.Color;
import java.awt.Graphics;


public class Circulo extends Figura {
    private float radio;

    public Circulo() {
        super();
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public Circulo(float radio, String nombre, String color, int x, int y) {
        super(nombre, color, x, y);
        this.radio = radio;
    }

   
    public void dibujar() 
    {
        
    }
    
    public void paint (Graphics g)
    {
    g.setColor(Color.blue);
    g.fillOval(getX(),getY(),50,50);
    }

    void dibujar(Graphics g) {
        
    }
}
