import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
public class Turnomatik {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        Queue<String>gente = new LinkedList<String>();
        Iterator<String> itq = gente.iterator(); //FALTA!
        String a;
        String name;
        String coger;

        do{
     
        System.out.println("      -----Menu-----");
        System.out.println("1. Nuevo cliente ha entrado");
        System.out.println("2. Atender al siguiente cliente");
        System.out.println("3. Mostrar cola actual");
        System.out.println("0. Salir");

        System.out.println("¿Cual opción eliges?");
        a = sc.nextLine();
        
        switch (a) {
            case "1":
                System.out.print("Introduce el nombre del cliente: ");
                name = sc.nextLine();
                gente.add(name);

                break;
            case "2":
                coger = gente.peek();
                System.out.printf("Atendiendo a %s\n", coger);
                System.out.printf("Eliminando de la cola a %s\n", coger);
                gente.poll();
                System.out.printf("Cola restante: %s\n", gente);
                break;
            case "3":
                System.out.println(gente);
                break;
            case "0":
                break;
        
            default:
                System.out.println("Opción invalida");
                break;
                
        }






        
        
    } while (a != "0");
    
    System.out.println("Chau");

    sc.close();
    }
}






