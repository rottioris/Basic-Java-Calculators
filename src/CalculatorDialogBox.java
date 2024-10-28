import javax.swing.*;

public class CalculatorDialogBox {
    public static void main(String[] args) {
        try {
            // Pedir primer número
            String primerMensaje = JOptionPane.showInputDialog(null, "Ingrese el primer número entero: ");
            int primerNumero = Integer.parseInt(primerMensaje); // Convertir a int

            // Pedir segundo número
            String segundoMensaje = JOptionPane.showInputDialog(null, "Ingrese el segundo número entero: ");
            int segundoNumero = Integer.parseInt(segundoMensaje); // Convertir a int

            // Pedir operación
            String tercerMensaje = JOptionPane.showInputDialog(null, "Ingrese la operación (+, -, *, /): ");
            char operacion = tercerMensaje.charAt(0); // Obtener el primer carácter

            int resultado = 0;

            // Realizar la operación seleccionada
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
                        JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
                        return; // Terminar el programa si hay división por cero
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operación no válida.");
                    return;
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero válido.");
        }
    }
}
