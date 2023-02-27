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
        lado = 1;
        calcularPerimetro();
        calcularArea();
    }
     
    //Getters
    public float getLado()
    {
        return lado;
    }
    
    public float getPerimetro()
    {
        return perimetro;
    }
    
    public float getArea()
    {
        return area;
    }
    
    //Setters
    public void setLado(float l)
    {
        lado = l;
        calcularPerimetro();
        calcularArea();
    }
    
    //Otros metodos
    private void calcularPerimetro()
    {
        perimetro = 4 * lado;        
    }
    
    private void calcularArea()
    {
        area = lado * lado;        
    }    
}
