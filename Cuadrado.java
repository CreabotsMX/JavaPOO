public class Cuadrado extends FigurasGeometricas 
{
    //Atributos
    private double lado;

    //Metodos
    
    //Constructores
    Cuadrado()
    {
        setLado(1);        
    }
    
    Cuadrado(double l)
    {
        setLado(l);
    }
    
    //Getters
    public double getLado()
    {
        return lado;
    }
    
    @Override
    public void setResultado()
    {      
        setResultado("P = " + getPerimetro() + " A = " + getArea());       
    }
    
    //Setters
    public void setLado(double l)
    {
        if(l > 0)
        {
            lado = l; 
            calcularPerimetro();
            calcularArea();
        }  
    }
    
    //Otros
    private void calcularPerimetro()
    {
        setPerimetro(4 * lado);
    }
    
    private void calcularArea()
    {
        setArea(lado * lado);
    }    
}