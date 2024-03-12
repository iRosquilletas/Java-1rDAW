import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class usuarios {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Introduce el nombre: ");
            String user = sc.nextLine();
            System.out.println("Introduce la contraseña: ");
            String password = sc.nextLine();

            try {
                FileWriter fw = new FileWriter("file51.txt", true);
                fw.write(user + ":" + password);
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
