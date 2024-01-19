package aceptaelreto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class a702 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int inicioAño = scanner.nextInt();
            int numMovimientos = scanner.nextInt();

            if (inicioAño == 0 && numMovimientos == 0) {
                break;
            }

            Map<String, Integer> ahorrosPorMes = new HashMap<>();
            ahorrosPorMes.put("01", inicioAño);

            for (int i = 0; i < numMovimientos; i++) {
                String fecha = scanner.next();
                int cantidad = scanner.nextInt();
                String concepto = scanner.nextLine().trim();

                String mes = fecha.substring(3, 5);

                if (!ahorrosPorMes.containsKey(mes)) {
                    ahorrosPorMes.put(mes, ahorrosPorMes.get(fecha.substring(0, 2)));
                }

                if (cantidad > 0) {
                    ahorrosPorMes.put(mes, ahorrosPorMes.get(mes) + cantidad);
                } else {
                    ahorrosPorMes.put(mes, ahorrosPorMes.get(mes) + cantidad);
                }
            }

            imprimirAhorros(ahorrosPorMes);
        }

        scanner.close();
    }

    public static void imprimirAhorros(Map<String, Integer> ahorrosPorMes) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 12; i++) {
            String mes = String.format("%02d", i);
            resultado.append(ahorrosPorMes.get(mes)).append(" ");
        }

        System.out.println(resultado.toString().trim());
    }
}
