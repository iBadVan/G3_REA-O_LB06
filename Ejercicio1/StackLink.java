package Ejercicio1;

import Actividad1.Stack;

public class StackLink<E> implements Stack<E>{
    private Node<E> top;

    public StackLink() {
        this.top = null;
    }
    
}
