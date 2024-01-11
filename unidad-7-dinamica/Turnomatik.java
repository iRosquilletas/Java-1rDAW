import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
public class Turnomatik {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int a;
        boolean b;
        b=true;
        System.out.println("      -----Menu-----");
        System.out.println("1. Nuevo cliente ha entrado");
        System.out.println("2. Atender al siguiente cliente");
        System.out.println("3. Mostrar cola actual");
        System.out.println("0. Salir");

        do{
        System.out.println("¿Cual opción eliges?");
        a = sc.nextInt();

        if (a == 0){
            b = false;
        }
        Queue<String>gente = new LinkedList<String>();
        gente.add("hola");
        System.out.println(gente);

        } while(b = true);

        System.out.print("OMG");

        sc.close();
    }
}
