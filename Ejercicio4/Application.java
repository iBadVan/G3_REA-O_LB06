package Ejercicio4;

import Actividad1.ExceptionIsEmpty;
import Ejercicio1.StackLink;

public class Application {
    
    public static boolean symbolBalancing(String s) {
        Stack<Character> pila = new StackLink<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) return false;
                try {
                    char tope = pila.pop();
                    if (!esPar(tope, c)) return false;
                } catch (ExceptionIsEmpty e) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
    
}
