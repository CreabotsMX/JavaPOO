
public class TrianguloRectangulo extends Rectangulo
{
//Atributos
    private double hipotenusa;

    public TrianguloRectangulo()
    {
        // initialise instance variables
        setBase(0);
        setAltura(0);
        setHipotenusa();
    }

    public TrianguloRectangulo(double b, double h)
    {
        // initialise instance variables
        setBase(b);
        setAltura(h);
        setHipotenusa();
    }
    
    //Getters
    public double getHipotenusa()
    {
        return hipotenusa;
    }
    
    //Setters
    public void setHipotenusa()
    {
        if(getBase() > 0 && getAltura() > 0)
        {
            hipotenusa = Math.sqrt(Math.pow(getBase(),2) + Math.pow(getAltura(),2));
            calcularPerimetro();
            calcularArea();
            
        }  
    }
    
    //Others
    private void calcularPerimetro()
    {
        setPerimetro(getBase() + getAltura() + getHipotenusa());
    }
    
    private void calcularArea()
    {
        setArea(getBase() * getAltura() / 2);
    }
    
    
    public String toString()
    {
        return "Hipotenusa = " + getHipotenusa() + " P = " + getPerimetro() + " A = " + getArea();
    }

   
}
