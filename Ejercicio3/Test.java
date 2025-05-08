package Ejercicio3;

import Actividad1.ExceptionIsEmpty;
import Actividad3.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<String, Integer> colaMensajes = new PriorityQueueLinked<>(4);

        System.out.println("== COLA DE PRIORIDAD MULTINIVEL ==");

        try {
            colaMensajes.enqueue("Urgente A", 0);
            colaMensajes.enqueue("Normal B", 2);
            colaMensajes.enqueue("Baja C", 3);
            colaMensajes.enqueue("Urgente D", 0);
            colaMensajes.enqueue("Normal E", 2);
            colaMensajes.enqueue("Alta F", 1);

            System.out.println("Contenido actual:\n" + colaMensajes);

            System.out.println("Front: " + colaMensajes.front()); 
            System.out.println("Back: " + colaMensajes.back());   

            System.out.println("Dequeue: " + colaMensajes.dequeue()); 
            System.out.println("Dequeue: " + colaMensajes.dequeue()); 

            System.out.println("\nContenido actualizado:\n" + colaMensajes);

        } catch (ExceptionIsEmpty e) {
            System.err.println("Excepción: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Prioridad inválida: " + e.getMessage());
        }
    }
}
