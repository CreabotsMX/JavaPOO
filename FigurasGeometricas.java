
public class FigurasGeometricas
{
    //Atributos
    private double perimetro;
    private double area;
   
    //Metodos
    //Constructores
    FigurasGeometricas()
    {       
        setPerimetro(0);
        setArea(0);
    }
    
    //Getters
    public double getPerimetro()
    {
        return perimetro;
    }

    public double getArea()
    {
        return area;
    }
    
    //Setters
    protected void setPerimetro(double p)
    {
        perimetro = p;
    }

    protected void setArea(double a)
    {
        area = a;
    }

  
}
