import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class impresora {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        boolean q = true;
        while (q) {
            System.out.println("Introduce la linea(q para salir): ");
            String pregunta = sc.nextLine();
            if (pregunta.equals("q")) {
                q = false;
            }

            try {
                FileWriter fw = new FileWriter("file51.txt", true);
                fw.write(pregunta + "\n");
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
