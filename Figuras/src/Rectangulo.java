
import java.awt.Color;
import java.awt.Graphics;


public class Rectangulo extends Figura {

    public Rectangulo() 
    {
        super();
       
    }

    public Rectangulo(String nombre, String color, int x, int y) 
    {
        super(nombre, color, x, y);
    }

  public void dibujar (Graphics g)
    {
        g.setColor(Color.red);
        g.drawRect(getX(), getY(), 50, 50);
    }

    @Override
    public void dibujar() 
    {
        
        
    }

   

    
    
}
