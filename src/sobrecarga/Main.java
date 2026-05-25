package sobrecarga;
import java.util.Scanner;

public class Main {
     
   public static void main(String[] args) {
	   
	   Scanner scanner = new Scanner(System.in);
	   Operacion op = new Operacion();
	   
	   System.out.print("Ingresa el primer número: ");
	   int a = scanner.nextInt();
	   
	   System.out.print("Ingresa el segundo número: ");
	   int b = scanner.nextInt();
	   
	   System.out.print("Ingresa el tercer número: ");
	   int c = scanner.nextInt();
	   
	   // Usando sobrecarga
	   System.out.println("Suma de 2 enteros: " + op.sumar(a, b));
	   System.out.println("Suma de 3 enteros: " + op.sumar(a, b, c));
	   System.out.println("Suma de decimales: " + op.sumar((double) a, (double) b));
	   
	   scanner.close();
   }
		
}
