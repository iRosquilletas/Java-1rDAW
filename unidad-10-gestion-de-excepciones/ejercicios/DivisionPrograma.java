import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce el numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Introduce el denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (Exception e) {
            System.out.println("Problemas con la división");
        } finally {
            scanner.close();
        }
    }
}
