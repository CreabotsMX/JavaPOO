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
    
  
    //Others
    private void calcularPerimetro()
    {
        setPerimetro(4 * lado);
    }
    
    private void calcularArea()
    {
        setArea(lado * lado);
    }    
}