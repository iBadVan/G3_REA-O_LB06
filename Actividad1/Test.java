package Actividad1;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> pilaEnteros = new StackArray<>(5);
        System.out.println("PILA DE ENTEROS: ");

        try {
            pilaEnteros.push(1);
            pilaEnteros.push(2);
            pilaEnteros.push(3);
            System.out.println("Contenido: " + pilaEnteros);
            System.out.println("Top: " + pilaEnteros.top());
            System.out.println("Pop: " + pilaEnteros.pop());
            System.out.println("Contenido después del pop: " + pilaEnteros);
        } catch (ExceptionIsEmpty e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println(" ");

        Stack<String> pilaStrings = new StackArray<>(3);
        System.out.println("== PILA DE STRINGS ==");
        try {
            pilaStrings.push("Uno");
            pilaStrings.push("Dos");
            System.out.println("Contenido: " + pilaStrings);
            System.out.println("Top: " + pilaStrings.top());
            pilaStrings.pop();
            System.out.println("Contenido después del pop: " + pilaStrings);
            pilaStrings.pop();
            System.out.println("¿Está vacía?: " + pilaStrings.isEmpty());
            pilaStrings.pop();
        } catch (ExceptionIsEmpty e) {
            System.err.println("Excepción capturada: " + e.getMessage());
        }

    }
}
