package Teoria;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
public class EDLinkedList{
 public static void main (String[] args){
 //Creamos LinkedList
 LinkedList<String> diasSemana = new LinkedList<String>();
 LinkedList<Integer> numeros = new LinkedList<Integer>();
 //Añadimos elementos al ArrayList
 diasSemana.add("Lunes"); diasSemana.add("Martes");
 diasSemana.add("Miércoles"); diasSemana.add("Jueves");
 diasSemana.add("Viernes"); diasSemana.add("Sabado");
 diasSemana.add("Domingo");
 for (int i=1; i<=10;i++){ numeros.add(i); }
//Iteramos la estructura con Iterator
 System.out.println("Iteramos con Iterator");
 Iterator<String> ital = diasSemana.iterator();
 while (ital.hasNext()){
 System.out.println(ital.next()); }
 Iterator<Integer> ital1 = numeros.iterator();
 while (ital1.hasNext()){
 System.out.println(ital1.next()); }
//Continúa en la siguiente hoja
 //Obtenemos el primer día, el último y el de en medio de la semana
 System.out.printf("El primer día de la semana es el %s\n",diasSemana.getFirst());
 System.out.printf("El día en la mitad de la semana es el %s\n",
diasSemana.get(diasSemana.size()/2));
 System.out.printf("El primer día de la semana es el %s\n",diasSemana.getLast());
 //Ordenamos las listas
 Collections.sort(diasSemana);
 Collections.sort(numeros,Collections.reverseOrder());
 //Iteramos la estructura con foreach
 System.out.println("Iteramos con foreach");
 for (String dia : diasSemana) {
 System.out.println(dia); }
 for (Integer numero : numeros) {
 System.out.println(numero); }
 }
}