
import java.util.LinkedList;
import java.util.Collection;
import java.util.Scanner;
public class Estadistica {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        
        String input;
        
        double numero;

            while (true){
                System.out.print("Introduzca un número o pulse 'q' para salir");
                input = sc.nextLine();
                
                if (input.equals("q")){
                    System.out.println("Vamos a salir del programa...");
                    break;
                }

                numero = Double.parseDouble(input);
                double a = numero;
                double b = ;
                System.out.print(a);


                



            }

         
            System.out.println("OMG");


            sc.close();
        }
     



    }


/*numeros ingresados: 1, 2, 3, 2

 * hacemos la media 1 + 2 + 3 +2 = 8 8/4 = 2.  2 es la media
 * Ahora (1 - 2) elevado a 2 = 1 
 * (2-2) elevado a 2 = 0
 * (3-2) elevado a 2 = 1
 * (2-2) elevado a 2 = 0 
 * Sumamos los resultados, que es 2 y lo dividimos en una raiz cuadrada entre el total de numeros ingresados, que son 4. 
 * Raiz cuadrada de 2 / 4
 * 
 * 
 */