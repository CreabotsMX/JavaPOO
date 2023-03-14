

public class Tiempo
{
    
    private int años;
    private int semanas;
    private int dias;
    private int horas;
    
    private int temp;
   
    public Tiempo()
    {
        horas = 0;
        calcularTiempo();
    }

    public int getAños()
    {      
        return años;
    }
    
    public int getSemanas()
    {      
        return semanas;
    }
    
    public int getDias()
    {      
        return dias;
    }
    
    public int getHoras()
    {      
        return horas;
    }
    
    public void setHoras(int h)
    {
        horas = h;
        calcularTiempo();
    }
    
    private void calcularTiempo()
    {
        años = horas / 8760;
        temp = horas % 8760;
        
        semanas = temp / 168;
        temp = temp % 168;
        
        dias = temp / 24;
        horas = temp % 24;
    }    
}
