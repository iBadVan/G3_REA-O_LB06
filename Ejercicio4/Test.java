package Ejercicio4;

public class Test {
    public static void main(String[] args) {
        String[] entradas = {
            "(()()())[()]", 
            "(((())))[]", 
            "([)][](", 
            "([{])}", 
            "[", 
            "[[][]]{{{}}}"
        };

        for (String entrada : entradas) {
            System.out.printf("Entrada: %-20s Resultado: %s%n", entrada, Application.symbolBalancing(entrada));
        }
    }
}
