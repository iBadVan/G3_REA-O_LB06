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
    }
}
