

public class SalarioMinimo
{
   
    private int horasTrabajoMes;
    private float salario;
    private float salarioMinimoCDMX;

    /**
     * Constructor for objects of class SalarioMinimo
     */
    public SalarioMinimo()
    {
        salarioMinimoCDMX = 207.44f;
        horasTrabajoMes = 0;
        calcularSalario();
    }

    public int getHorasTrabajoMes()
    {
        return horasTrabajoMes;
    }

    public float getSalario()
    {
        return salario;
    }
    
    public float getSalarioMinimoCDMX()
    {
        return salarioMinimoCDMX;
    }
    
    public void setHorasTrabajoMes(int h)
    {
        horasTrabajoMes = h/8;
        calcularSalario();
    }
    
    private void calcularSalario()
    {
        salario = horasTrabajoMes * salarioMinimoCDMX;
    }
}
