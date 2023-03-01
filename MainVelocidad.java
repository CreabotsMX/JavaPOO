import java.util.Scanner;

public class MainVelocidad
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Velocidad objeto1 = new Velocidad();
        
        System.out.println("Programa que calcula la velovidad de un objeto");
        
        System.out.print("Introduce la distancia [km]: ");
        float d = scanner.nextFloat();
        objeto1.setDistanciaKm(d);

        System.out.print("Introduce el tiempo [min]: ");
        float t = scanner.nextFloat();
        objeto1.setTiempoMin(t);
        
        System.out.println("V = " + objeto1.getVelocidad() + " km/h");
    }
}
