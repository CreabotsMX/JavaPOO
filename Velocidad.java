public class Velocidad
{
    //Atributos   
    private float velocidad;
    private float distancia;
    private float tiempo;
    
    //Constructor
    public Velocidad()
    {
        distancia = 0;
        tiempo = 0; 
        velocidad = 0;
    }

    //Getters
    public float getVelocidad()
    {
        return velocidad;
    }
    
    public float getTiempo()
    {
        return tiempo;
    }
    
    public float getDistancia()
    {
        return distancia;
    }
    
    //Setters
    public void setDistanciaKm(float d)
    {
        distancia = d;
        calcularVelocidad();
    }
    
    public void setDistanciaM(float d)
    {
        distancia = d / 1000;
        calcularVelocidad();
    }    

    public void setTiempoMin(float t)
    {
        tiempo = t / 60;
        calcularVelocidad();
    }
    
    public void setTiempoH(float t)
    {
        tiempo = t;
        calcularVelocidad();
    }
    
    //OtrosMetodos
    private void calcularVelocidad()
    {
        velocidad = distancia / tiempo;
    }
    
}