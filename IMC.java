

public class IMC
{
    // instance variables - replace the example below with your own
    private double estatura;
    private double peso;
    private double imc;
    private String clasificacion;
    

    public IMC()
    {
        setPeso(0);
        setEstatura(0);
    }

    public IMC(double peso, double estatura)
    {
        setPeso(peso);
        setEstatura(estatura);
    }
    //Getters
    public double getEstatura()
    {
        return estatura;
    }

    public double getPeso()
    {
        return peso;
    }
    
    public double getIMC()
    {
        return imc;
    }
    
    public String getClasificacion()
    {        
        if(imc < 18.5)
        {
            clasificacion = "Desnutricion";
        }
        
        else if(imc >= 18.5 && imc < 25)
        {
            clasificacion = "Normal";
        }

        else if(imc >= 25 && imc < 30)
        {
            clasificacion =  "Sobrepeso";
        }
        
        else if(imc >= 30 && imc < 35)
        {
            clasificacion =  "Obesidad grado 1";
        }
        
        return clasificacion;
    }
    
    //Setters
    public void setPeso(double p)
    {
        if(p > 0)
            peso = p;
            
        if(peso > 0 && estatura > 0)
        {
            calcularIMC();
            getClasificacion();
        }
        
    }

    public void setEstatura(double e)
    {
        if(e > 0)
            estatura = e;
            
        if(peso > 0 && estatura > 0)
        {
            calcularIMC();
            getClasificacion();
        }
        
    }
    
    private void calcularIMC()
    {
        imc = peso / (estatura * estatura);
    }
    
}
