
public class Rectangulo
{
    
    private float base;
    private float altura;
    private float perimetro;
    private float area; 

    public Rectangulo()
    {
        base = 1;
        altura = 1;
        calcularPerimetro();
        calcularArea();
    }
    
    //Getters
    public float getBase()
    {
        return base;
    }

    public float getAltura()
    {
        return altura;
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
    public void setBase(float b)
    {
        base = b;
        calcularPerimetro();
        calcularArea();
    }

    public void setAltura(float h)
    {
        altura = h;
        calcularPerimetro();
        calcularArea();
    }        

    //Otros
    private void calcularPerimetro()
    {
        perimetro = (base + altura) * 2;        
    }

    private float calcularArea()
    {
        area = base * altura;
    }
}
