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
        resultado = = "Ingresa los datos";           
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
    
    public String getResultado()
    {      
        return resultado = "P = " + getPerimetro() + " A = " + getArea();       
    }
    
    //Setters
    public void setPerimetro(double p)
    {
        perimetro = p;
    }

    public void setArea(double a)
    {
        area = a;
    }

  
}