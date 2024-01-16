
import java.util.ArrayList;
import java.util.Scanner;

public class Estadistica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        System.out.println("Introduce números (o 'q' para salir):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double numero = Double.parseDouble(input);
                numeros.add(numero);

                double media = calcularMedia(numeros);
                double desviacionTipica = calcularDesviacionTipica(numeros, media);

                System.out.println("Media: " + media);
                System.out.println("Desviación Típica: " + desviacionTipica);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido o 'q' para salir.");
            }
        }

        scanner.close();
    }

    private static double calcularMedia(ArrayList<Double> numeros) {
        double suma = 0;

        for (double numero : numeros) {
            suma += numero;
        }

        return suma / numeros.size();
    }

    private static double calcularDesviacionTipica(ArrayList<Double> numeros, double media) {
        double sumaCuadrados = 0;

        for (double numero : numeros) {
            sumaCuadrados += Math.pow(numero - media, 2);
        }

        return Math.sqrt(sumaCuadrados / numeros.size());
    }
}

/*
 * numeros ingresados: 1, 2, 3, 2
 * 
 * hacemos la media 1 + 2 + 3 +2 = 8 8/4 = 2. 2 es la media
 * Ahora (1 - 2) elevado a 2 = 1
 * (2-2) elevado a 2 = 0
 * (3-2) elevado a 2 = 1
 * (2-2) elevado a 2 = 0
 * Sumamos los resultados, que es 2 y lo dividimos en una raiz cuadrada entre el
 * total de numeros ingresados, que son 4.
 * Raiz cuadrada de 2 / 4
 * 
 * 
 */