import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Programa que calcula perimetro y area de diferentes figuras geometricas");
        byte opcion;
        
        do
        {    
            mostrarMenuPrincipal();
            System.out.print("Ingresa una opcion: ");
            opcion = scanner.nextByte();
            
            switch(opcion)
            {
                case 1:
                    System.out.print("Lado: ");
                    float lado = scanner.nextFloat();
                    Cuadrado cuadrado = new Cuadrado(lado);
                    System.out.println(cuadrado.getResultados());
                    break;
                
                case 2:
                    System.out.print("Base: ");
                    float base = scanner.nextFloat();
                    System.out.print("Altura: ");
                    float altura = scanner.nextFloat();
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    System.out.println(rectangulo.getResultados());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                    
                default:
                    System.out.println("Ingresa una opcion valida.");
            }
            
            if(opcion != 5)
            {
                System.out.println("Presiona enter para continuar...");
                scanner.nextLine(); // Limpiar el buffer del scanner
                scanner.nextLine(); // Esperar la pulsación de Enter
            }
            
        }while(opcion != 5);
        
        scanner.close();
    }
    
    private static void mostrarMenuPrincipal()
    {
        System.out.println("\nMENU");
        System.out.println("1.Cuadrado");
        System.out.println("2.Rectangulo");
        System.out.println("3.Triangulo");
        System.out.println("4.Circulo");
        System.out.println("5.Salir");
    }
   
    
}