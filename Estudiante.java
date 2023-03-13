public class Estudiante 
{
    //atributos
    int numCuenta;
    String nombre;
    float promedio;
    
    //constructor (Sobrecarga de constructores)
    Estudiante()
    {
        System.out.println("Se ha creado un estudiante");
    }
    Estudiante(String _nombre)
    {
        System.out.println("Se ha creado un estudiante de nombre: \"" + _nombre + "\"");
        nombre = _nombre;
    }
    Estudiante(String _nombre, int _numCuenta)
    {
        System.out.println("Se ha creado un estudiante de nombre: \"" + _nombre + "\""
                + " y con número de cuenta: " + _numCuenta);
        nombre = _nombre;
        numCuenta = _numCuenta;
    }
    
    //métodos
    void estudiar()
    {
        System.out.println(nombre + " está estudiando...");
    }
    void aprobar()
    {
        System.out.println(nombre + " aprobó...");
    }
    void reprobar()
    {
        System.out.println(nombre + " reprobó...");
    }
    
    //métodos set
    public void setNumCuenta(int _numCuenta) 
    {
        numCuenta = _numCuenta;
    }
    public void setNombre(String _nombre) 
    {
        nombre = _nombre;
    }
    public void setPromedio(float _promedio) 
    {
        promedio = _promedio;
    }
    
    //métodos get
    public int getNumCuenta() 
    {
        return numCuenta;
    }
    public String getNombre() 
    {
        return nombre;
    }
    public float getPromedio() 
    {
        return promedio;
    } 
}
