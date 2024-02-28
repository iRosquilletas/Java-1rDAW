import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionPrograma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce el numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Introduce el denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Has introducido un valor no numérico");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: El denominador no puede ser 0");
        } catch (Exception e) {
            System.out.println("Problemas con la división");
        } finally {
            scanner.close();
        }
    }
}
