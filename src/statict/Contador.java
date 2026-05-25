package statict;

public class Contador {

	private static int totalObjetos = 0;

    public Contador() {
       totalObjetos++;
    }

    
    public static int getContador() {
        return totalObjetos;
    }

  
    public static void main(String[] args) {
        System.out.println("=== SIMULACIÓN DE CONTADOR DE OBJETOS ===");
        System.out.println("Objetos al iniciar: " + Contador.getContador()); 

         new Contador();
         new Contador();
         new Contador();
        
        System.out.println("Objetos creados en total: " + Contador.getContador()); 
    }
}