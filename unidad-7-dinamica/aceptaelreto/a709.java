package aceptaelreto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class a709 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numVotos = scanner.nextInt();

            if (numVotos == 0) {
                break;
            }

            Map<String, Integer> conteoVotos = new HashMap<>();

            for (int i = 0; i < numVotos; i++) {
                String voto = scanner.next();
                conteoVotos.put(voto, conteoVotos.getOrDefault(voto, 0) + 1);
            }

            int maxVotos = 0;
            String ganador = "EMPATE";

            for (Map.Entry<String, Integer> entry : conteoVotos.entrySet()) {
                if (entry.getValue() > maxVotos) {
                    maxVotos = entry.getValue();
                    ganador = entry.getKey();
                } else if (entry.getValue() == maxVotos) {
                    ganador = "EMPATE";
                }
            }

            System.out.println(ganador);
        }

        scanner.close();
    }
}
