package Actividad2;

import Actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
         Queue<Integer> colaEnteros = new QueueLink<>();
        System.out.println("== COLA DE ENTEROS ==");
        try {
            colaEnteros.enqueue(10);
            colaEnteros.enqueue(20);
            colaEnteros.enqueue(30);
            System.out.println("Contenido: " + colaEnteros);
            System.out.println("Front: " + colaEnteros.front());
            System.out.println("Back: " + colaEnteros.back());
            System.out.println("Dequeue: " + colaEnteros.dequeue());
            System.out.println("Contenido tras dequeue: " + colaEnteros);
        } catch (ExceptionIsEmpty e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println(" ");

        // Cola de Strings
        Queue<String> colaStrings = new QueueLink<>();
        System.out.println("== COLA DE STRINGS ==");
        try {
            colaStrings.enqueue("Hola");
            colaStrings.enqueue("Mundo");
            System.out.println("Contenido: " + colaStrings);
            System.out.println("Front: " + colaStrings.front());
            colaStrings.dequeue();
            System.out.println("Contenido tras dequeue: " + colaStrings);
            colaStrings.dequeue();
            System.out.println("¿Está vacía?: " + colaStrings.isEmpty());
            colaStrings.dequeue();  
        } catch (ExceptionIsEmpty e) {
            System.err.println("Excepción capturada: " + e.getMessage());
        }
    }
}
