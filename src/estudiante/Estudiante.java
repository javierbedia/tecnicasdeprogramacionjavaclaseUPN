
package estudiante;
import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {


private String nombre;

    // Constructor
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {

        ArrayList<Estudiante> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ESTUDIANTES ===");
        System.out.println("Escribe 'salir' para terminar.\n");

        while (true) {
            System.out.print("Ingresa el nombre del estudiante: ");
            String nombre = teclado.nextLine().trim();

            // Salir del programa
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                // Validaciones
                if (nombre.isEmpty()) {
                    throw new IllegalArgumentException("El nombre no puede estar vacío.");
                }

                if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                    throw new IllegalArgumentException("Solo letras permitidas.");
                }

                // Crear objeto y agregar
                Estudiante e = new Estudiante(nombre);
                lista.add(e);

                System.out.println("✔ Estudiante agregado");

            } catch (IllegalArgumentException ex) {
                System.out.println("❌ ERROR: " + ex.getMessage());
            }
        }

        teclado.close();

        // Mostrar lista
        System.out.println("\n=== LISTA DE ESTUDIANTES ===");

        if (lista.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            int i = 1;
            for (Estudiante e : lista) {
                System.out.println(i + ". " + e.getNombre());
                i++;
            }
        }

        System.out.println("=================================");
    }
}

