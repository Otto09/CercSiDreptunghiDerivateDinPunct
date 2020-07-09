package desene_Lab_11;

public class Punct
{
    // instance variables - replace the example below with your own
    int x;
    int y;
    String culoare;
    boolean vizibil;

    /**
     * Constructor for objects of class Punct
     */
    public Punct(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        culoare = "blue";
        vizibil = false;
    }
    
    /**
     * Metode Set - Get
     */
    public void SetX(int x)
    {
        this.x = x;
    }
    
    public int GetX()
    {
        return x;
    }
    
    public void SetY(int y)
    {
        this.y = y;
    }
    
    public int GetY()
    {
        return y;
    }
    
    public void schimbaCuloarea(String c)
    {
        culoare = c;
        
        if (vizibil)
        {
            sterge();
            deseneaza();
        }
    }
    
    public String getCuloare()
    {
        return culoare;
    }
        
    public void moveHorizontal(int dx)
    {
        if (vizibil)
        {
            sterge();
        }
        
        x += dx;
        
        if (vizibil)
        {
            deseneaza();
        }
    }
    
    public void moveVertical(int dy)
    {
        if (vizibil)
        {
            sterge();
        }
        
        y += dy;
        
        if (vizibil)
        {
            deseneaza();
        }
    }
    
    public void faVizibil()
    {
        vizibil = true;
        deseneaza();
    }
    
    public void faInvizibil()
    {
        vizibil = false;
        sterge();
    }
    
    public boolean getVizibil()
    {
        return vizibil;
    }
    
    public void sterge()
    {
        if(vizibil)
        {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    
    public void deseneaza() {}
    
}
