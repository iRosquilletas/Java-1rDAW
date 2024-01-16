import java.util.Scanner;
import java.util.Stack;

public class CalculadoraRPN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Double> pila = new Stack<>();

        System.out.println("Calculadora RPN (Escribe 'q' para salir)");

        while (true) {
            mostrarPila(pila);

            System.out.print("Ingresa número u operador: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double numero = Double.parseDouble(input);
                pila.push(numero);
            } catch (NumberFormatException e) {
                if (puedeRealizarOperacion(pila, input)) {
                    realizarOperacion(pila, input);
                } else {
                    System.out.println("Error: Entrada no válida.");
                }
            }
        }

        scanner.close();
    }

    public static void mostrarPila(Stack<Double> pila) {
        System.out.print("Pila: ");
        for (double elemento : pila) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static boolean puedeRealizarOperacion(Stack<Double> pila, String operador) {
        return pila.size() >= 2
                && ("+".equals(operador) || "-".equals(operador) || "*".equals(operador) || "/".equals(operador));
    }

    public static void realizarOperacion(Stack<Double> pila, String operador) {
        if (puedeRealizarOperacion(pila, operador)) {
            double operand2 = pila.pop();
            double operand1 = pila.pop();
            double resultado = 0;

            switch (operador) {
                case "+":
                    resultado = operand1 + operand2;
                    break;
                case "-":
                    resultado = operand1 - operand2;
                    break;
                case "*":
                    resultado = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) {
                        System.out.println("Error: División por cero.");
                        return;
                    }
                    resultado = operand1 / operand2;
                    break;
                default:
                    System.out.println("Error: Operador no válido.");
                    return;
            }

            pila.push(resultado);
        }
    }
}
