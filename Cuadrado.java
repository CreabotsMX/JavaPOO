

public class Cuadrado
{
    //Atributos
    private float lado;
    private float perimetro;
    private float area;
    
    //Constructor
    public Cuadrado()
    {
        // initialise instance variables
        setLado(1);
    }
    
    public Cuadrado(float l)
    {
        setLado(l);

    }

    //Metodos
    public void setLado(float l)
    {
        if(l <= 0)
        {
            lado = 1;
        }
        
        else
        {
            lado = l;
            calcularPerimetro();
            calcularArea();
        }
    }
    
    public float getLado()
    {
        return lado;
    }
    
    public float getPeriometro()
    {
        return perimetro;
    }
    
    public float getArea()
    {
        return area;
    }
    
    private void calcularPerimetro()
    {
        perimetro = 4*lado;
    }
    
    private void calcularArea()
    {
        area = lado*lado;
    }
}
