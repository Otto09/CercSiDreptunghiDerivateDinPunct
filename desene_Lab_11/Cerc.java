package desene_Lab_11;

import java.awt.*;
import java.awt.geom.*;

public class Cerc extends Punct
{
    // instance variables
    private int r;

    /**
     * Constructor for objects of class Cerc
     */
    public Cerc(int x, int y, int r)
    {
        // initialise instance variables
        super(x-r, y-r);
        this.r = r;
    }
    
    /**
     * Metode Set - Get
     */
    public void SetR(int r)
    {
        this.r = r;
    }
    
    public int GetR()
    {
        return r;
    }
    
    public void deseneaza()
    {
        if (vizibil)
        {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, culoare, new Ellipse2D.Double(x - r, y - r,
                2 * r, 2 * r) );
            canvas.wait(10);
        }
    }
}
