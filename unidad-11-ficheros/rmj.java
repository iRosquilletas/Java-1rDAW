import java.io.File;

public class rmj {
    public static void main(String[] agrs) {

        try {
            File file = new File(agrs[0]);
            if (file.delete()) {
                System.out.println("Fichero borrado");
            } else {
                System.out.println("El fichero no existe.");
            }
        } catch (Exception e) {
            System.out.println("XD");
        }

    }
}
