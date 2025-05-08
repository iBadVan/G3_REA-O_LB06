package Ejercicio1;

import Actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> pilaEnteros = new StackLink<>();
        System.out.println("PILA DE ENTEROS (LISTA ENLAZADA): ");
        try {
            pilaEnteros.push(100);
            pilaEnteros.push(200);
            pilaEnteros.push(300);
            System.out.println("Contenido: " + pilaEnteros);
            System.out.println("Top: " + pilaEnteros.top());
            System.out.println("Pop: " + pilaEnteros.pop());
            System.out.println("Contenido luego del pop: " + pilaEnteros);
        } catch (ExceptionIsEmpty e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println(" ");
        

    }
}
