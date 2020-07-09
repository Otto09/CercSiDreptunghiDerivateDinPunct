package desene_Lab_11;

import java.awt.*;
import java.awt.geom.*;

public class Dreptunghi extends Punct
{
    // instance variables
    private int a;
    private int b;

    /**
     * Constructor for objects of class Dreptunghi
     */
    public Dreptunghi(int x, int y, int a, int b)
    {
        // initialise instance variables
        super(x-a, y-b);
        this.a = a;
        this.b = b;
    }
    
    /**
     * Metode Set - Get
     */
    public void SetA(int a)
    {
        this.a = a;
    }
    
    public int GetA()
    {
        return a;
    }
    
    public void SetB(int b)
    {
        this.b = b;
    }
    
    public int GetB()
    {
        return b;
    }
    
    public void deseneaza()
    {
        if (vizibil)
        {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, culoare, new Rectangle(x - a, y - b, a, b) );
            canvas.wait(10);
        }
    }
    
}
