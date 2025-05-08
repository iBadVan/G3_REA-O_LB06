package Actividad3;

import Actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<String, Integer> colaMensajes = new PriorityQueueLinkSort<>();

        System.out.println("== COLA DE PRIORIDAD: MENSAJES ==");

        try {
            colaMensajes.enqueue("Mensaje A", 2);
            colaMensajes.enqueue("Mensaje B", 5);
            colaMensajes.enqueue("Mensaje C", 3);
            colaMensajes.enqueue("Mensaje D", 5); 
            colaMensajes.enqueue("Mensaje E", 1);

            System.out.println("Contenido: " + colaMensajes);
            System.out.println("Front (mayor prioridad): " + colaMensajes.front());
            System.out.println("Back (menor prioridad): " + colaMensajes.back());

            System.out.println("Dequeue: " + colaMensajes.dequeue());
            System.out.println("Después del dequeue: " + colaMensajes);

        } catch (ExceptionIsEmpty e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println(" ");

        PriorityQueue<Double, Double> colaNumeros = new PriorityQueueLinkSort<>();

        System.out.println("== COLA DE PRIORIDAD: NÚMEROS ==");

        try {
            colaNumeros.enqueue(1.1, 0.5);
            colaNumeros.enqueue(2.2, 2.0);
            colaNumeros.enqueue(3.3, 1.0);

            System.out.println("Contenido: " + colaNumeros);
            System.out.println("Front: " + colaNumeros.front());
            System.out.println("Back: " + colaNumeros.back());
        } catch (ExceptionIsEmpty e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
