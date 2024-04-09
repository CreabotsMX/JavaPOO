
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        byte opcion;
        
        do
        {
            System.out.println("MENU");
            System.out.println("1.Cuadrado");
            System.out.println("2.Rectangulo");
            System.out.println("3.Triangulo rectangulo");
            System.out.println("4.Circulo");
            System.out.println("5.Salir");
            
            System.out.print("Ingresa una opcion: ");
            opcion = sc.nextByte();
            
            double lado1, lado2;
            
            switch(opcion)
            {
                case 1:
                    System.out.print("Ingresa la base: ");
                    lado1 = sc.nextDouble();
                    Cuadrado cuadrado1 = new Cuadrado();
                    cuadrado1.setLado(lado1);
                    System.out.println(cuadrado1.toString());
                    break;
                    
                case 5:
                    System.out.println("Hasta luego");
                    break;
                
                default:
                    System.out.println("Ingresa una opcion valida");
            }
            
            
            if(opcion != 5)
            {
                System.out.println("Presiona enter para continuar...");
                sc.nextLine();
                sc.nextLine();
            }
            
        }while(opcion != 5);

        
    }
}
