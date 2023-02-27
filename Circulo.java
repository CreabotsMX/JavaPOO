public class Circulo
{
    //Atributos
    private float radio;
    private float diametro;
    private float perimetro;
    private float area;

    //Constructor
    Circulo()
    {
        radio = 1;
        diametro = radio * 2;
        calcularPerimetro();
        calcularArea();        
    }

    //Getters
    public float getRadio()
    {
        return radio;
    }

    public float getDiametro()
    {
        return 2*radio;
    }

    public float getPerimetro()
    {
        return radio;
    }

    public float getArea()
    {
        return radio;
    }

    //Setters
    public void setRadio(float r)
    {
        radio = r;
        diametro = 2 * r;
        calcularPerimetro();
        calcularArea();
    }

    public void setDiametro(float d)
    {
        diametro = d;
        radio = d/2;
        calcularPerimetro();
        calcularArea();
    }

    //Otros métodos
    private void calcularPerimetro()
    {
        perimetro = (float) (Math.PI * diametro);
    }

    private void calcularArea()
    {
        area = (float) (Math.PI * Math.pow(radio,2));
    }

}