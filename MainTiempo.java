import java.util.Scanner;

public class MainTiempo
{
   public static void main(String [] args)
   {
       Scanner scanner = new Scanner(System.in);
       Tiempo tiempo1 = new Tiempo();
       
       System.out.println("Programa que permite convertir la cantidad de horas totales en años, semanas, dias y horas");
       
       System.out.print("\nIntroduce la cantidad de horas totales: ");
       int h = scanner.nextInt();
       tiempo1.setHoras(h);
       
       System.out.println("\n"+ h + " horas equivalen a " + tiempo1.getAños() + " años, " + tiempo1.getSemanas() + " semanas, " + tiempo1.getDias() + " días y " + tiempo1.getHoras() + " horas.");
       
   }
}
