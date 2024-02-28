import java.util.Scanner;

public class InOK {
    private Scanner scanner;
    public static final String[] COMPOSITORES = { "Bach", "Haydn", "Mozart", "Beethoven", "Brahms", "Mahler",
            "Bartok" };

    public InOK() {
        scanner = new Scanner(System.in);
    }

    public int LeeInt() {
        int num = 0;
        boolean inputAccepted = false;
        do {
            try {
                System.out.print("Introduce un número entero: ");
                num = scanner.nextInt();
                inputAccepted = true;
            } catch (Exception e) {
                System.out.println("Error: Por favor ingresa un número entero válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        } while (!inputAccepted);
        return num;
    }

    public int LeeIntPos() {
        int num;
        do {
            num = LeeInt();
            if (num <= 0) {
                System.out.println("Error: Por favor ingresa un número entero positivo.");
            }
        } while (num <= 0);
        return num;
    }

    public int LeeIntRango(int min, int max) {
        int num;
        do {
            num = LeeInt();
            if (num < min || num > max) {
                System.out.println("Error: Por favor ingresa un número entero en el rango [" + min + ", " + max + "].");
            }
        } while (num < min || num > max);
        return num;
    }

    public double LeeDou() {
        double num = 0;
        boolean inputAccepted = false;
        do {
            try {
                System.out.print("Introduce un número real: ");
                num = scanner.nextDouble();
                inputAccepted = true;
            } catch (Exception e) {
                System.out.println("Error: Por favor ingresa un número real válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        } while (!inputAccepted);
        return num;
    }

    public double LeeDouRango(double min, double max) {
        double num;
        do {
            num = LeeDou();
            if (num < min || num > max) {
                System.out.println("Error: Por favor ingresa un número real en el rango [" + min + ", " + max + "].");
            }
        } while (num < min || num > max);
        return num;
    }

    public int ValidaString() throws ElementoNoExistente {
        System.out.print("Introduce un nombre de compositor: ");
        String nombreCompositor = scanner.nextLine();

        for (int i = 0; i < COMPOSITORES.length; i++) {
            if (COMPOSITORES[i].equalsIgnoreCase(nombreCompositor)) {
                return i; // Devuelve el índice si el nombre del compositor coincide
            }
        }

        throw new ElementoNoExistente("El compositor \"" + nombreCompositor + "\" no existe.");
    }

    public static void main(String[] args) {
        InOK inputHandler = new InOK();

        int entero = inputHandler.LeeInt();
        System.out.println("Número entero: " + entero);

        int enteroPositivo = inputHandler.LeeIntPos();
        System.out.println("Número entero positivo: " + enteroPositivo);

        int enteroEnRango = inputHandler.LeeIntRango(1, 100);
        System.out.println("Número entero en rango: " + enteroEnRango);

        double real = inputHandler.LeeDou();
        System.out.println("Número real: " + real);

        double realEnRango = inputHandler.LeeDouRango(0.0, 10.0);
        System.out.println("Número real en rango: " + realEnRango);

        try {
            int indice = inputHandler.ValidaString();
            System.out.println("El compositor se encuentra en la posición " + indice + " del array.");
        } catch (ElementoNoExistente e) {
            System.out.println(e.getMessage());
        }
    }
}

class ElementoNoExistente extends Exception {
    public ElementoNoExistente(String message) {
        super(message);
    }
}
