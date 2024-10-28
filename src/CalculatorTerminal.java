import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer número entero: ");
            int primerNumero = scanner.nextInt();

            System.out.println("Ingrese el segundo número entero: ");
            int segundoNumero = scanner.nextInt();

            System.out.println("Ingrese la operación (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);

            int resultado = 0;

            switch (operacion) {
                case '+':
                    resultado = primerNumero + segundoNumero;
                    break;
                case '-':
                    resultado = primerNumero - segundoNumero;
                    break;
                case '*':
                    resultado = primerNumero * segundoNumero;
                    break;
                case '/':
                    if (segundoNumero != 0) {
                        resultado = primerNumero / segundoNumero;
                    } else {
                        System.out.println("No se puede dividir por cero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
                    return;
            }

            System.out.println("El resultado es: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número entero.");
            main(args); // Llama nuevamente a main para intentar otra vez
        }
    }
}
