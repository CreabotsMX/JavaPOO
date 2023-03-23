
import java.util.Scanner;

public class MainDinero
{
   public static void main(String [] args)
   {
       Scanner entrada = new Scanner(System.in);
       Dinero dinero1 = new Dinero();
       
       System.out.print("Ingresa el dinero que tiehe Guillermo: ");
       float n = entrada.nextFloat();
       dinero1.setGuillermo(n);
       
       System.out.println("Guillermo $"+ dinero1.getGuillermo());
       System.out.println("Luis $"+ dinero1.getLuis());
       System.out.println("Juan $"+ dinero1.getJuan());
       System.out.println("Total $"+ dinero1.getTotal());
   }
    
}
