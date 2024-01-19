package aceptaelreto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a238 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numBilletes = scanner.nextInt();
            int numParticipantes = scanner.nextInt();

            if (numBilletes == 0 && numParticipantes == 0) {
                break;
            }

            ArrayList<Integer> billetes = new ArrayList<>();
            for (int i = 0; i < numBilletes; i++) {
                billetes.add(scanner.nextInt());
            }

            Collections.sort(billetes, Collections.reverseOrder());
            ArrayList<Integer> reparto = new ArrayList<>();
            int index = 0;

            for (int i = 0; i < numParticipantes; i++) {
                reparto.add(0);
            }

            for (int i = 0; i < numBilletes; i++) {
                reparto.set(index, reparto.get(index) + billetes.get(i));
                index = (index + 1) % numParticipantes;
            }

            for (int i = 0; i < numParticipantes; i++) {
                System.out.print(reparto.get(i) + ":");
                for (int j = 0; j < numBilletes; j++) {
                    if (j < numBilletes - 1) {
                        System.out.print(" " + billetes.get(j));
                    } else {
                        System.out.println(" " + billetes.get(j));
                    }
                }
            }

            System.out.println("---");
        }

        scanner.close();
    }
}
