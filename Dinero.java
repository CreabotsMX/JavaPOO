
public class Dinero
{
    // instance variables - replace the example below with your own
    private float guillermo;
    private float luis;
    private float juan;
    private float total;
    

    public Dinero()
    {
        // initialise instance variables
        guillermo = 0;
        calcularDinero();
    }

    public float getGuillermo()
    {
        return guillermo;
    }
    
    public float getLuis()
    {
        return luis;
    }
    
    public float getJuan()
    {
        return juan;
    }
    
    public float getTotal()
    {
        return total;
    }
    
    public void setGuillermo(float n)
    {
        guillermo = n;
        calcularDinero();
    }
    
    private void calcularDinero()
    {
        juan = guillermo / 2;
        luis = (guillermo + juan) / 2;
        total = guillermo + juan + luis;
    }
}
