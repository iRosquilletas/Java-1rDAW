import java.util.Scanner;
import java.util.Stack;

public class CalculadoraRPN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Double> pila = new Stack<>();
        String numero2;
        System.out.println("Calculadora RPN (Escribe 'q' para salir)");

        while (true) {

            System.out.print("Pila: ");
            for (double elemento : pila) {
                System.out.print(elemento + " ");
            }
            System.out.println();

            System.out.print("Ingresa número u operador: ");
            numero2 = sc.nextLine();

            if (numero2.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double numero = Double.parseDouble(numero2);
                pila.push(numero);
            } catch (NumberFormatException e) {
                if (pila.size() >= 2
                        && ("+".equals(numero2) || "-".equals(numero2) || "*".equals(numero2) || "/".equals(numero2))) {
                    if (!pila.isEmpty()) {
                        double operand2 = pila.pop();
                        if (!pila.isEmpty()) {
                            double operand1 = pila.pop();
                            double resultado = 0;
                            switch (numero2) {
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
                                    resultado = operand1 / operand2;
                                    break;
                                default:
                                    System.out.println("Error");
                                    continue;
                            }
                            pila.push(resultado);
                        } else {
                            System.out.println("Error");
                        }
                    } else {
                        System.out.println("Error");
                    }
                } else {
                    System.out.println("Error");
                }
            }

        }

        System.out.println("¡Que tenga un buen día!");
        sc.close();
    }
}
