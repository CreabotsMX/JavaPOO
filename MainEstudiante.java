public class MainEstudiante 
{
    public static void main(String[] args) 
    {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Areli");
        Estudiante estudiante3 = new Estudiante("Eduardo",321548796);
        
        estudiante1.setNombre("Karla");
        System.out.println("Estudiante1 tiene el nombre: \"" + estudiante1.getNombre() + "\"");
        
        estudiante2.estudiar();
        estudiante2.reprobar();
        
        estudiante3.setPromedio((float)9.35);
        System.out.println(estudiante3.getNombre()+ " tiene un promedio de: " + estudiante3.getPromedio());
    }
}
