public class Rectangulo extends FigurasGeometricas 
{
    //Atributos
    private double base;
    private double altura;
   
    //Constructores
    Rectangulo()
    {
        setBase(0);
        setAltura(0);
    }
    
    Rectangulo(double b, double h)
    {
        setBase(b);
        setAltura(h);
    }
    
    //Getters
    public double getBase()
    {
        return base;
    }
    
    public double getAltura()
    {
        return altura;
    }
    
    //Setters
    public void setBase(double b)
    {
        if(b > 0)
        {
            base = b;
        }
        
        if(base > 0 && altura > 0)
        {
            calcularPerimetro();
            calcularArea();
        }  
    }

    public void setAltura(double h)
    {
        if(h > 0)
        {
            altura = h;
        }
        
        if(base > 0 && altura > 0)
        {
            calcularPerimetro();
            calcularArea();
        }  
    }
  
    //Others
    private void calcularPerimetro()
    {
        setPerimetro((2*base)+(2*altura));
    }
    
    private void calcularArea()
    {
        setArea(base * altura);
    }
    
    
    public String toString()
    {
        return "P = " + getPerimetro() + " A = " + getArea();
    }
}