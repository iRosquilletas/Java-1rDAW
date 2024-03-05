import java.util.Scanner;

public class tercero {
    static Scanner sc = new Scanner(System.in);

    public static int LeeInt() {
        int num = 0;
        try {
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
        }
        return num;

    }

    public static int LeeIntPos() {
        int num = 0;
        boolean inputValido = false;
        while (!inputValido) {
            try {
                System.out.println("Introduce un número: ");
                num = sc.nextInt();
                if (num > 0) {
                    inputValido = true;
                } else {
                    System.out.println("Error jj");
                }
            } catch (Exception e) {
                System.out.println("Error k");
                sc.nextLine();
            }
        }
        return num;
    }

    public static int LeeIntRango(int min, int max) {
        int num = 0;
        boolean a = false;
        while (!a) {
            try {

                System.out.println("Introduce un número: ");
                num = sc.nextInt();
                if (num >= min && num <= max) {
                    a = true;
                } else {
                    System.out.println("No está en el rango");
                }
            } catch (Exception e) {
                System.out.println("Error numerico");
            }
        }
        return num;
    }

    public static void main(String[] agrs) {
        // int numero = LeeInt();
        // System.out.println("Número introducido: " + numero);
        // int entero = LeeIntPos();
        // System.out.println("Número entero positivo : " + entero);
        int numero = LeeIntRango(10, 20);
        System.out.println("El número introducido es: " + numero);
    }
}
