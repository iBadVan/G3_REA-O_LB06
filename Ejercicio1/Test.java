package Ejercicio1;
import Actividad1.Stack;
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

        Stack<String> pilaStrings = new StackLink<>();
        System.out.println("PILA DE STRINGS (LISTA ENLAZADA):");
        try {
            pilaStrings.push("Primero");
            pilaStrings.push("Segundo");
            pilaStrings.push("Tercero");
            System.out.println("Contenido: " + pilaStrings);
            System.out.println("Top: " + pilaStrings.top());
            pilaStrings.pop();
            pilaStrings.pop();
            pilaStrings.pop();
            System.out.println("¿Está vacía?: " + pilaStrings.isEmpty());
            pilaStrings.pop();  
        } catch (ExceptionIsEmpty e) {
            System.err.println("Excepción capturada: " + e.getMessage());
        }

    }
}
