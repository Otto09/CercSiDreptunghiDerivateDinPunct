import desene_Lab_11.*;

public class Lab_11
{
    // instance variables
    private Punct p1;
    private Punct p2;
    private Punct p3;
    private Punct p4;
    private Punct p5;
    private Punct p6;

    /**
     * Constructor for objects of class Lab_11
     */
    public Lab_11()
    {
        // initialise instance variables
        p1 = new Cerc(100, 100, 30);
        p2 = new Dreptunghi(100, 140, 50, 70);
        p3 = new Dreptunghi(200, 200, 15, 80);
        p4 = new Dreptunghi(150, 200, 80, 15);
        p5 = new Dreptunghi(200, 200, 20, 90);
        p6 = new Dreptunghi(100, 100, 20, 90);
        
        p1.schimbaCuloarea("yellow");
        p1.moveHorizontal(75);
        p1.faVizibil();
        
        p2.moveHorizontal(120);
        p2.moveVertical(100);
        p2.faVizibil();
        
        p3.faVizibil();
        
        p4.moveVertical(-70);
        p4.moveHorizontal(50);
        p4.faVizibil();
        
        p5.schimbaCuloarea("green");
        p5.moveVertical(150);
        p5.moveHorizontal(-12);
        p5.faVizibil();
        
        p6.schimbaCuloarea("green");
        p6.moveVertical(250);
        p6.moveHorizontal(62);
        p6.faVizibil();
    }
    
    public static void main(String[] s)
    {
        Lab_11 l = new Lab_11();
    }
    
}
