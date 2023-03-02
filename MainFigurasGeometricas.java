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
        
        Rectangulo  rectangulo1 = new Rectangulo();       
        System.out.print("Introduce la base del rectangulo: ");
        float b = sc.nextFloat();
        rectangulo1.setBase(b);
        System.out.print("Introduce la altura del rectangulo: ");
        float h = sc.nextFloat();
        rectangulo1.setAltura(h);       
        System.out.println("Para un rectangulo de base " + rectangulo1.getBase() + " y altura " + rectangulo1.getAltura() + " el P = " + rectangulo1.getPerimetro() + " y el A = " + rectangulo1.getArea());
        
    }
}
