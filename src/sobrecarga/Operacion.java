package sobrecarga;

public class Operacion {
     
	// Suma de 2 enteros
	public int sumar(int a, int b) {
		return a + b;

	}
    // Suma de 3 enteros
	public int sumar(int a, int b, int c) {
		return a + b + c;
	}
	
	// Suma de 2 doubles
	public double sumar(double a, double b) {
		return a + b;
		
	}
}
