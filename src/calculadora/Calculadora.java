package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Operaciones: +  -  *  /");
        System.out.println("Elija una operación:");
        char op = sc.next().charAt(0);

        double resultado = calcular(num1, num2, op);

        System.out.println("Resultado:: " + resultado);

        sc.close();
    }

    public static double calcular(double a, double b, char op) {

        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b != 0) return a / b;
                else {
                    System.out.println("Error: división por cero");
                    return 0;
                }
            default:
                System.out.println("Operación inválida");
                return 0;
        }
    }
}