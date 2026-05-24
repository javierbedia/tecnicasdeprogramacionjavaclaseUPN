package persona;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona ();
		p1.nombre = " Ian";
		p1.edad = 13;
		
		Persona p2= new Persona ();
		p2.nombre = "Adriel";
		p2.edad = 3;
		
		
		p1.mostrarDatos();
		System.out.println("======================");
		p2.mostrarDatos();
		

	}

}
