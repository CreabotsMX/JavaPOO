public class FigurasGeometricas
{
    //Atributos
    private double perimetro;
    private double area;
    private String resultado;
   
    //Metodos
    //Constructores
    FigurasGeometricas()
    {       
        resultado = "Ingresa los valores";
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
    
    public String getResultados()
    {      
        return resultado = "P = " + getPerimetro() + "\nA = " + getArea();       
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