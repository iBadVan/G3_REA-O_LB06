package Actividad1

public interface Stack<E>{
    void push(E x);
    void pop() throws ExceptionIsEmpty;
    void top() throws ExceptionIsEmpty;
    boolean isEmpty();
}