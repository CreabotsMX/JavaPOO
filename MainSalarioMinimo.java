import java.util.Scanner;

public class MainSalarioMinimo
{
   public static void main(String [] args)
   {
       Scanner scanner = new Scanner(System.in);
       SalarioMinimo salario1 = new SalarioMinimo();
       
       System.out.println("Programa que permite calcular el salario de un trabajador en la CDMX dadas las horas totales de trabajo");
       
       System.out.print("\nIntroduce la cantidad de horas totales: ");
       int h = scanner.nextInt();
       salario1.setHorasTrabajoMes(h);
       
       System.out.println("\nEl salario a pagar por " + h + " horas de trabajo es $" + salario1.getSalario() +".");
       System.out.println("NOTA: Considerando el salario minimo por 8 horas de trabajo en CDMX = " + salario1.getSalarioMinimoCDMX());       
   }
}
