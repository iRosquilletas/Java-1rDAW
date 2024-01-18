import java.util.Scanner;
import java.util.Stack;
public class prueba {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Double> pila = new Stack<>();
        double numero2;
        while (true) {

            System.out.print("Pila: ");
            for (double elemento : pila) {
                System.out.print(elemento + " ");
            }
            System.out.println();

            System.out.print("Introduce un número o apreta 'q' para salir ");
            numero2 = sc.nextDouble();

                pila.push(numero2);
           
            sc.close();
            }

         
        
    }
    
    }

