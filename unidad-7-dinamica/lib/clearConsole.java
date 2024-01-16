package lib;

public class clearConsole {
    public static void main(String[] args) {
        try {
            // Dependiendo del sistema operativo, utiliza el comando correspondiente para
            // limpiar la consola
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                // Para Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Para sistemas operativos basados en Unix/Linux/Mac
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            // Manejar excepciones si ocurre algún problema al intentar limpiar la consola
            System.out.println("Error al intentar limpiar la consola: " + e.getMessage());
        }
    }
}
