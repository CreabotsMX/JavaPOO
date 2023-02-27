import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Cuadrado  cuadrado1 = new Cuadrado();
        
        System.out.print("Introduce el lado del cuadrado: ");
        float l = sc.nextFloat();
        cuadrado1.setLado(l);
        
        System.out.println("Para un cuadrado de lado " + cuadrado1.getLado() + " el P = " + cuadrado1.getPerimetro() + " y el A = " + cuadrado1.getArea());
        
        
    }
}
