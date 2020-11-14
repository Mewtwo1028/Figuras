
import java.awt.Color;
import java.awt.Graphics;


public class Cuadrado extends Figura {

    public Cuadrado () 
    {
        super();
       
    }

    public Cuadrado(String nombre, String color, int x, int y) 
    {
        super(nombre, color, x, y);
    }

  public void dibujar (Graphics g)
    {
        g.setColor(Color.red);
        g.drawRect(getX(), getX(), 50, 50);
    }

    @Override
    public void dibujar() 
    {
        
        
    }

   

    
    
}
