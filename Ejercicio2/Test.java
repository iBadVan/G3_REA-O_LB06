package Ejercicio2;

import Actividad1.ExceptionIsEmpty;
import Actividad2.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> colaEnteros = new QueueArray<>(5);
        System.out.println("COLA DE ENTEROS (ARREGLO): ");
        try {
            colaEnteros.enqueue(10);
            colaEnteros.enqueue(20);
            colaEnteros.enqueue(30);
            System.out.println("Contenido: " + colaEnteros);
            System.out.println("Front: " + colaEnteros.front());
            System.out.println("Back: " + colaEnteros.back());

            System.out.println("Dequeue: " + colaEnteros.dequeue());
            System.out.println("Contenido después del dequeue: " + colaEnteros);
        } catch (ExceptionIsEmpty e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println(" ");

        Queue<String> colaStrings = new QueueArray<>(3);
        System.out.println("COLA DE STRINGS (ARREGLO): ");
        try {
            colaStrings.enqueue("Uno");
            colaStrings.enqueue("Dos");
            colaStrings.enqueue("Tres");
            System.out.println("Contenido: " + colaStrings);
            System.out.println("Front: " + colaStrings.front());
            colaStrings.dequeue();
            System.out.println("Después de dequeue: " + colaStrings);
            colaStrings.enqueue("Cuatro"); 
            System.out.println("Después de insertar 'Cuatro': " + colaStrings);
        } catch (ExceptionIsEmpty e) {
            System.err.println("Excepción capturada: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Excepción de ejecución: " + e.getMessage());
        }
    }
}
