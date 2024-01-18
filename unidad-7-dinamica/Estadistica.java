import java.util.ArrayList;
import java.util.Scanner;

public class Estadistica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        System.out.println("Introduce números (o 'q' para salir):");

        double suma = 0;
        double sumaCuadrados = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double numero = Double.parseDouble(input);
                numeros.add(numero);

                suma += numero;
                double media = suma / numeros.size();

                sumaCuadrados += Math.pow(numero - media, 2);
                double desviacionTipica = Math.sqrt(sumaCuadrados / numeros.size());

                System.out.println("Media: " + media);
                System.out.println("Desviación Típica: " + desviacionTipica);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido o 'q' para salir.");
            }
        }

        scanner.close();
    }
}
