public class Rectangulo extends FigurasGeometricas
{
    //Atributos
    private double base;
    private double altura;
    
    Rectangulo()
    {
        base = 1;
        altura = 1;
        calcularPerimetro();
        calcularArea();
    }
    
    Rectangulo(double b, double h)
    {
        base = b;
        altura = h;
        calcularPerimetro();
        calcularArea();        
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
    
    //Setter
    public void setBase(double b)
    {
        if (b > 0)
            base = b;
        
        if(base > 0 && altura > 0)
        {
            calcularPerimetro();
            calcularArea();
        }
    }
    
    public void setAltura(double h)
    {
        if(h > 0)
            altura = h;
        
        if(base > 0 && altura > 0)
        {
            calcularPerimetro();
            calcularArea();
        }
    }
    
    private void calcularPerimetro()
    {
        setPerimetro((2*base)+(2*altura));
    }
    
    private void calcularArea()
    {
        setArea(base+altura);
    }
    
}