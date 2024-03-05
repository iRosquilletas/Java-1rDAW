import java.util.Scanner;

public class segundo {
    private static Scanner scanner = new Scanner(System.in);

    // Método para leer un número entero
    public static int LeeInt() {
        int num = 0;
        try {
            System.out.print("Introduce un número entero: ");
            num = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número entero válido.");
            num = LeeInt();
        }
        return num;
    }

    // Método para leer un número entero positivo
    public static int LeeIntPos() {
        int num = 0;
        do {
            num = LeeInt();
            if (num <= 0) {
                System.out.println("Error: Debes ingresar un número entero positivo.");
            }
        } while (num <= 0);
        return num;
    }

    // Método para leer un número entero en un rango determinado
    public static int LeeIntRango(int min, int max) {
        int num = 0;
        do {
            num = LeeInt();
            if (num < min || num > max) {
                System.out.println("Error: Debes ingresar un número entero en el rango [" + min + ", " + max + "].");
            }
        } while (num < min || num > max);
        return num;
    }

    // Método para leer un número real
    public static double LeeDou() {
        double num = 0;
        try {
            System.out.print("Introduce un número real: ");
            num = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número real válido.");
            num = LeeDou(); // Llamada recursiva para intentar leer nuevamente
        }
        return num;
    }

    // Método para leer un número real en un rango determinado
    public static double LeeDouRango(double min, double max) {
        double num = 0;
        do {
            num = LeeDou();
            if (num < min || num > max) {
                System.out.println("Error: Debes ingresar un número real en el rango [" + min + ", " + max + "].");
            }
        } while (num < min || num > max);
        return num;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        int entero = LeeInt();
        System.out.println("Número entero ingresado: " + entero);

        int enteroPositivo = LeeIntPos();
        System.out.println("Número entero positivo ingresado: " + enteroPositivo);

        int enteroRango = LeeIntRango(10, 20);
        System.out.println("Número entero en rango ingresado: " + enteroRango);

        double real = LeeDou();
        System.out.println("Número real ingresado: " + real);

        double realRango = LeeDouRango(5.5, 10.5);
        System.out.println("Número real en rango ingresado: " + realRango);
    }
}
